package DesktopGUI.Messenger;

import java.util.LinkedList;
import java.util.List;

public class DialogList {

    private List<Dialog> _dialogs;

    public List<Dialog> getDialogs() {
        return _dialogs;
    }

    public void add(Dialog dialog) {
        if (_dialogs == null)
            _dialogs = new LinkedList<Dialog>();

        _dialogs.add(dialog);
    }

    public void remove(Dialog dialog)
    {
        if (_dialogs.contains(dialog)) _dialogs.remove(dialog);
    }


}
