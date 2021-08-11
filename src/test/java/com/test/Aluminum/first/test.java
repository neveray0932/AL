package com.test.Aluminum.first;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class test {
	
	@Test
	public void method() {
		int n =4;
		for(int i = 0; i<n; i++) {
			for(int j =n*i+1;j<=n*i+4;j++) {
				if(j<10) {
					System.out.print(j);
				}
				if(j>9) {
					System.out.print(j-10);
				}
				
				
			}
			System.out.println();
		}
	}
	
	@Test
	public void method2() {
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
