/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prog6112ice2;

/**
 *
 * @author maist
 */
public class Prog6112ice2 {

    public static void main(String[] args) {
        // Create sample sales agents
        Salesagent agent1 = new Salesagent("Thabo Nkosi", "SA001", 15000, 12, 0.08);
        Salesagent agent2 = new Salesagent("Lerato Dube", "SA002", 12000, 4, 0.05);
        Salesagent agent3 = new Salesagent("Sipho Mahlangu", "SA003", 18000, 15, 0.10);
 
        Salesagent[] agents = { agent1, agent2, agent3 };
 
        System.out.println("===== CAR DEALERSHIP - SALES AGENT REPORT =====\n");
 
        for (Salesagent agent : agents) {
            agent.printReport();
            System.out.println(agent.generateQuote());
            System.out.println();
        }
    }
}
