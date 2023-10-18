/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package process_management;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author vuhoa
 */
    class Process {
    String name;
    int burstTime;

    public Process(String name, int burstTime) {
        this.name = name;
        this.burstTime = burstTime;
    }
    }
public class rr {

    public static void main(String[] args) {
        Queue<Process> processQueue = new LinkedList<>();
        processQueue.add(new Process("P1", 6));
        processQueue.add(new Process("P2", 8));
        processQueue.add(new Process("P3", 7));
        processQueue.add(new Process("P4", 10));

        int timeQuantum = 2; // Thời gian CPU cấp

        while (!processQueue.isEmpty()) {
            Process currentProcess = processQueue.poll();
            System.out.println("Running process: " + currentProcess.name);

            if (currentProcess.burstTime > timeQuantum) {
                currentProcess.burstTime -= timeQuantum;
                // Đặt lại tiến trình vào hàng đợi
                processQueue.add(currentProcess);
            } else {
                System.out.println(currentProcess.name + " has completed.");
            }
        }
}
}


