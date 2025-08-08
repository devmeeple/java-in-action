package basic.poly.ex.sender;

/**
 * 문제: 다중 메시지 발송
 * 1) 다형성을 활용한 인터페이스 구현
 * - 이메일, SMS, Facebook
 */
public class SendMain {
    public static void main(String[] args) {
        Sender[] senders = {
                new EmailSender(),
                new SmsSender(),
                new FacebookSender()
        };

        for (Sender sender : senders) {
            sender.sendMessage("환영합니다!");
        }
    }
}
