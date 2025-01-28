package Day01.doubly_linkedlist.undo_redo_functionality;

class TextState {
    String textContent;
    TextState next;
    TextState prev;

    public TextState(String textContent) {
        this.textContent = textContent;
        this.next = null;
        this.prev = null;
    }
}