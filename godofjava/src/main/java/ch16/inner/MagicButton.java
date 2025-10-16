package ch16.inner;

public class MagicButton {
    private EventListener listener;

    public MagicButton() {
    }

    public void setListener(EventListener listener) {
        this.listener = listener;
    }

    public void onClickProcess() {
        if (listener != null) {
            listener.onClick();
        }
    }
}
