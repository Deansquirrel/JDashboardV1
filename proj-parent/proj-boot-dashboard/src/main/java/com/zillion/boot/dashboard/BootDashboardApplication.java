package com.zillion.boot.dashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.zillion","com.yuansong"})
public class BootDashboardApplication {
	
	public static void main(String[] args) {
		
		long begTime = System.currentTimeMillis();
		
		SpringApplication.run(BootDashboardApplication.class, args);
		
		long endTime = System.currentTimeMillis();
		
		System.out.println("\n"
				+ "-----------------------------------------------------------------------\n"
				+ "-----------------------------------------------------------------------\n"
				+ "                               _     _\n"
				+ "                              ( \\---/ )\n"
				+ "                               ) . . (\n" 
				+ "-------------------------,--._(___Y___)_,--.---------------------------\n" 
				+ "                         `--'           `--'\n" 
				+ "                         Dashboard  启动成功                   \n" 
				+ "\n" 
				+ " 启动耗时: " + (endTime - begTime) + "毫秒 \n" 
				+ "-----------------------------------------------------------------------\n" 
				+ "-----------------------------------------------------------------------\n");
	}

}
