package com.me.performance;

import java.awt.Point;
import java.util.HashMap;

public class ProblemFive {
    // Counts the number of numbers that the entry is evenly divisible by, as max is 20
    static int statictwentyDivCount(int a) {    
        int count = 0;
        for (int i = 1; i<21; i++) {
            if (a % i == 0) {
                count++;
            }
        }
        return count;
    }
    
    int twentyDivCount(int a) {   
        int count = 0;
        for (int i = 1; i<21; i++) {
            if (a % i == 0) {
                count++;
            }
        }
        return count;
    }

    private static HashMap<Integer, Point> perf = new HashMap<>();
    
    private static void addPoint(Integer run, Double value, boolean isStatic) {
        if (perf.containsKey(run)) {
            perf.put(run, isStatic? addY(perf.get(run), value): addX(perf.get(run), value));
        }
    }
    
    private static Point addY(Point p, Double value) {
        p.setLocation(p.getX(), value); return p;
    }
    
    private static Point addX(Point p, Double value) {
        p.setLocation(value, p.getY()); return p;
    }

    public static void main(String[] args) {
        new Thread() {
            @Override
            public synchronized void run() {
                for (int x = 0; x < 10; x++) {
                    StringBuilder buf = new StringBuilder("(non-static results):");
                    long startT = System.currentTimeMillis();
                    int start = 500000000;
                    int result = start;
                    ProblemFive ff = new ProblemFive();
                    for (int i = start; i > 0; i--) {
                        int temp = ff.twentyDivCount(i); // Faster way

                        if (temp == 20) {
                            result = i;
                            buf.append(String.format(" %s", result));
                        }
                    }
                    buf.append(String.format(" %s", result));
                    long end = System.currentTimeMillis();
                    buf.append(String.format("\n\t >>> (non-static) Elapsed time: %s", (end - startT)));
                    addPoint(x, Double.parseDouble(""+(end - startT)), false);
                    System.out.println(buf.toString());
                }
            }
        }.start();
        
        new Thread() {
            @Override
            public synchronized void run() {
                for (int x = 0; x < 10; x++) {
                    StringBuilder buf = new StringBuilder("(static results):");
                    long startT = System.currentTimeMillis();
                    int start = 500000000;
                    int result = start;
                    for (int i = start; i > 0; i--) {
                        int temp = statictwentyDivCount(i);// - slower

                        if (temp == 20) {
                            result = i;
                            buf.append(String.format(" %s", result));
                        }
                    }
                    buf.append(String.format(" %s", result));
                    long end = System.currentTimeMillis();
                    buf.append(String.format("\n\t >>> (static) Elapsed time: %s", (end - startT)));
                    addPoint(x, Double.parseDouble(""+(end-startT)), true);
                    System.out.println(buf.toString());
                }
            }
            
        }.start();
        
        System.out.println(perf);
    }
    
}
