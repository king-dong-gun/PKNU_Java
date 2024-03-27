package codingTest.exam02;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookMain {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<BookClass> bookList = new ArrayList<>();


        while (true) {
            System.out.println("******메뉴를 선택하세요******");
            System.out.println("1.도서 등록");
            System.out.println("2.도서 검색");
            System.out.println("3.도서 삭제");
            System.out.println("4.도서 확인");
            System.out.println("5.도서 구입");
            System.out.println("0.종료");
            int inputData = scanner.nextInt();
            scanner.nextLine();

            if (inputData == 1) {
                System.out.println("전자책과 종이책 중 원하시는 책을 고르세요.");
                System.out.println();
                System.out.println("--------1. 전자책, 2. 종이책--------");
                int eBook = scanner.nextInt();
                scanner.nextLine();
                if (eBook == 1) {
                    System.out.println("전자책을 선택하셨습니다.");
                    System.out.println();
                    System.out.print("제목을 등록하세요. --> ");
                    String title = scanner.nextLine();
                    System.out.print("글쓴이를 등록하세요. --> ");
                    String author = scanner.nextLine();
                    System.out.print("가격을 등록하세요. --> ");
                    int price = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("출판사를 등록하세요. --> ");
                    String publish = scanner.nextLine();
                    System.out.print("호환기기를 입력하세요. --> ");
                    String superDevices = scanner.nextLine();
                    EBookClass eBookClass = new EBookClass(title, author, price, publish, superDevices); //호한기계 입력
                    bookList.add(eBookClass);
                    System.out.println();
                }
                if (eBook == 2) {
                    System.out.println("종이책을 선택하셨습니다.");
                    System.out.println();
                    System.out.print("제목을 등록하세요. --> ");
                    String title = scanner.nextLine();
                    System.out.print("글쓴이를 등록하세요. --> ");
                    String author = scanner.nextLine();
                    System.out.print("가격을 등록하세요. --> ");
                    int price = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("출판사를 등록하세요. --> ");
                    String publish = scanner.nextLine();
                    System.out.print("페이지수를 입력하세요. --> ");
                    int size = scanner.nextInt();
                    scanner.nextLine();
                    PaperBookClass paperBookClass = new PaperBookClass(title, author, price, publish, size); // 페이지수 입력
                    bookList.add(paperBookClass);
                    System.out.println("책이 저장되었습니다.");
                    System.out.println();
                }
            } else if (inputData == 2) {
                System.out.print("검색하실 책 제목이나 저자를 입력하세요: --> ");
                String searchBook = scanner.nextLine();
                System.out.println();
                BookClass book = searchBook(searchBook, bookList);
                if (book == null) {
                    System.out.println("잘못된 정보입니다.");
                    System.out.println();
                } else {
                    System.out.println("찾으시는 책의 정보입니다.");
                    System.out.println();
                    bookInfo(book);
                    System.out.println();
                }

            } else if (inputData == 3) {
                System.out.print("삭제할 도서명을 입력하세요. --> ");
                String removeBook = scanner.nextLine();
                System.out.println();
                BookClass book = searchBook(removeBook, bookList);
                if (book == null) {
                    System.out.println("잘못된 정보입니다.");
                    System.out.println();
                } else {
                    bookList.remove(book);
                    System.out.println("등록 삭제되었습니다.");
                    System.out.println();
                }
            } else if (inputData == 4) {
                System.out.println("----------전체 도서 목록입니다.----------");
                System.out.println();
                for (BookClass book : bookList) {
                    bookInfo(book);
                    System.out.println("------------------------------------");
                    System.out.println();
                }
            } else if (inputData == 5) {
                System.out.print("어떤책을 구매하시겠습니까? --> ");
                String title = scanner.nextLine();
                System.out.print("전자책은 1번, 종이책은 2번을 눌러주세요: ");
                int bookType = scanner.nextInt();
                scanner.nextLine();
                System.out.println();

                BookClass findBook = buyTheBook(bookType, title, bookList);
                if (findBook == null) {
                    System.out.println("잘못된 정보입니다.");
                    System.out.println();
                } else {
                    bookList.remove(findBook);
                    System.out.println();
                }

            } else {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }
        scanner.close();
    }

    // 책 제목 또는 책 저자를 찾기 위한 메소드
    private static BookClass searchBook(String keyword, List<BookClass> bookList) {
        for (BookClass book : bookList) {
            if (book.getTitle().equals(keyword) || book.getAuthor().equals(keyword)) {
                return book;
            }
        }
        return null;
    }


    //종이책과 전자책의 구별을 위한 메소드
    private static void bookInfo(BookClass book) {
        if (book instanceof EBookClass eBook) eBook.deviceInfo();
        else if (book instanceof PaperBookClass paperBook) paperBook.sizeInfo();
    }

    //전자책일때
    private static BookClass buyTheBook(int bookType, String title, List<BookClass> bookList) {
        if (bookType == 1) {
            for (BookClass b : bookList) {
                if (b.getTitle().equals(title) && b instanceof EBookClass eBook) {
                    float totalPrice = eBook.getPrice() * eBook.getTax();
                    System.out.println("제목 " + eBook.getTitle() + "을 " + totalPrice + "원에 구매하셨습니다. 호환기기는 " + eBook.getSuperDevice() + " 입니다.");
                    System.out.println();
                    return eBook;
                }
            }
            //종이책일때
        } else if (bookType == 2) {
            for (BookClass b : bookList) {
                if (b.getTitle().equals(title) && b instanceof PaperBookClass paperBook) {
                    float totalPrice = paperBook.getPrice() * paperBook.getTax();
                    System.out.println("제목 " + paperBook.getTitle() + "을 " + totalPrice + "원에 구매하셨습니다. 총 페이지 수 는 " + paperBook.getSize() + "페이지 입니다.");
                    System.out.println();
                    return paperBook;
                }
            }
        }
        return null;
    }
}
