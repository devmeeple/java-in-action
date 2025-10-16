package ch16.inner;

public class AnonymousSample {
    public static void main(String[] args) {
        AnonymousSample sample = new AnonymousSample();
        sample.setButtonListenerAnonymous();
    }

    public void setButtonListenerAnonymous() {
        MagicButton button = new MagicButton();
        button.setListener(new EventListener() {
            @Override
            public void onClick() {
                System.out.println("Magic Button Clicked !!!");
            }
        });
        button.onClickProcess();
    }
}
