package book;
import java.util.*;

class Book {
	String title;
	int score;		//count는 쓸모가 없는것 같습니다
	
	public Book(String title, int score) {
		this.title = title;
		this.score = score;
	}
	
	public String toString() {
		return "<" + title + ">, 평점: " + score;
	}
}

public class BookTest {
	static Scanner sc;
	
	private static void printMenu() {
		System.out.println("============================");
		System.out.println("1. 책 등록");
		System.out.println("2. 책 검색");
		System.out.println("3. 모든 책 출력");
		System.out.println("4. 종료");
		System.out.println("============================");
		System.out.print("번호를 입력하세요: ");
	}
	
	static void addBook(ArrayList<Book> list) {
		System.out.print("제목: ");
		String title = sc.nextLine();
		System.out.print("평점: ");
		int score = sc.nextInt();
		list.add(new Book(title, score));
		System.out.println("책을 리스트에 추가했습니다.");
	}
	
	static void searchBook(ArrayList<Book> list) {
		System.out.print("책 제목을 입력하세요: ");
		String title = sc.nextLine();
		for (Book k : list) {
			if (title.equals(k.title)) {
				System.out.println(k);
				return;
			}
		}
		System.out.println("해당하는 책을 찾지 못했습니다.");
	}
	
	static void printAllBooks(ArrayList<Book> list) {
		for (Book k : list) {
			System.out.println(k);
		}
	}
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		ArrayList<Book> list = new ArrayList<>();
		int select;
		while (true) {
			printMenu();
			select = sc.nextInt(); sc.nextLine(); //개행 버퍼
			switch (select) {
			case 1: addBook(list);			break;
			case 2: searchBook(list);		break;
			case 3: printAllBooks(list);	break;
			case 4: return;
			}
		}
	}
}
 