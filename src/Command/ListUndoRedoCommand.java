package Command;

import Caretaker.Caretaker;

public class ListUndoRedoCommand implements Command{
    private Caretaker caretaker;

    public ListUndoRedoCommand(Caretaker caretaker) {
        this.caretaker = caretaker;
    }

    @Override
    public void execute() {
        caretaker.displayUndoRedoList();
    }
}
