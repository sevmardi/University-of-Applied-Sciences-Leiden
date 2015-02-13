__author__ = 'SM'
import sys
import 

 # from tkinter import *

# #create new window
# root = Tk()
# root.title("Hello world app")
# root.geometry('200x85')
#
# app = Frame()
# app.grid()
# lbl = Label(app, text = "Hello World!")
# lbl.grid()
#
# bttn1 = Button(app, text = "Press")
# bttn1.grid()
#
# root.mainloop()




from qt import *

a = QApplication(sys.argv)

# Our function to call when the button is clicked
def sayHello():
	print("Hello world")

# Instantiate the button
hellobutton = QPushButton("Say 'Hello world!'",None)

# And connect the action "sayHello" to the event "button has been clicked"
a.connect(hellobutton, SIGNAL("clicked()"), sayHello)

# The rest is known already...
a.setMainWidget(hellobutton)
hellobutton.show()
a.exec_loop()