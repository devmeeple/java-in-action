package ch16.inner;

public class AnonymousSample {
    public static void main(String[] args) {
        AnonymousSample sample = new AnonymousSample();
        sample.setButtonListenerAnonymousObject();
    }

    public void setButtonListenerAnonymousObject() {
        MagicButton button = new MagicButton();
        EventListener listener = new EventListener() {
            @Override
            public void onClick() {
                System.out.println("Magic Button Clicked !!!");
            }
        };
        button.setListener(listener);
        button.onClickProcess();
    }
}
