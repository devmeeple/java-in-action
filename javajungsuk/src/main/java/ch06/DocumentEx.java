package ch06;

public class DocumentEx {
    public static void main(String[] args) {
        Document document1 = new Document();
        Document document2 = new Document("자바.txt");
        Document document3 = new Document();
        Document document4 = new Document();
    }
}

class Document {
    static int count = 0;
    String name;

    Document() {
        this("제목없음" + ++count);
    }

    Document(String name) {
        this.name = name;
        System.out.println("문서 " + this.name + "가 생성되었습니다.");
    }
}
