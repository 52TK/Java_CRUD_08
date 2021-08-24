package com.sbs.java.crud;

import java.util.Scanner;

//https://git-scm.com/

public class Main {
	public static void main(String[] args) {
		System.out.println("== 프로그램 시작 ==");
		Scanner sc = new Scanner(System.in);   // 키보드 입력 스캔해라
		int lastArticleId = 0;
		
		while(true) {
			System.out.printf("명령어)");
			String command = sc.nextLine().trim();	//한번에 하나씩 출력 - nextLine[전체출력], next, nextInt[숫자], nextLine().trim() [앞뒤공백없애기]
			if (command.length() == 0) {
				continue;
			}
			if (command.equals("system exit")) {
				break;
			}
			if (command.equals("article write")) {
				int id = lastArticleId + 1;
				lastArticleId = id;
				System.out.println("제목 : ");
				String title = sc.nextLine();
				System.out.println("내용 : ");
				String body = sc.nextLine();
				
				System.out.printf("%d번 글이 생성되었습니다.\n",id);
			} else if (command.equals("article list")) {
				System.out.println("게시물이 없습니다.");
			} else {
				System.out.printf("%s(은)는 존재하지 않는 명령어입니다.\n",command);
			}
		}
		
		sc.close();    // 키보드 입력 종료
			
		System.out.println("== 프로그램 끝 ==");
		
	}
}
