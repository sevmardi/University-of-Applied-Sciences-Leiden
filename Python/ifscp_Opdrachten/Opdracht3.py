__author__ = 'Sevak Mardirosian'
import sys
from PyQt4 import QtGui, uic


class DialogDemo(QtGui.QWidget):

    #----------------------------------------------------------------------
    def __init__(self):
        """Constructor"""
        # super(DialogDemo, self).__init__()
        QtGui.QWidget.__init__(self)
        self.label = QtGui.QLabel("Python rules!")
        # create the buttons
        fileDialogBtn =  QtGui.QPushButton("Open File Dialog")
        # connect the buttons to the functions (signals to slots)
        fileDialogBtn.clicked.connect(self.openFileDialog)
        # layout widgets
        layout = QtGui.QVBoxLayout()
        layout.addWidget(self.label)
        layout.addWidget(fileDialogBtn)
        self.setLayout(layout)
        # set the position and size of the window
        self.setGeometry(100, 100, 400, 100)

        self.setWindowTitle("OPDRACHT 3")

    def openFileDialog(self):
        """
        Opens a file dialog and sets the label to the chosen path
        """
        import os
        path, _ = QtGui.QFileDialog.getOpenFileName(self, "Open File", os.getcwd())
        self.label.setText(path)


#----MAIN------------------------------------------------------------------
def main():
    app = QtGui.QApplication(sys.argv)
    form = DialogDemo()
    form.show()
    app.exec_()


if __name__ == '__main__':
    main()


