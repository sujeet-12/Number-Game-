import math
from kivy.app import App
from kivy.uix.boxlayout import BoxLayout
from kivy.uix.button import Button
from kivy.uix.textinput import TextInput

class AdvancedCalculator(App):
    def build(self):
        self.last_was_operator = False
        self.result = TextInput(font_size=32, readonly=True, halign="right", multiline=False)

        layout = BoxLayout(orientation="vertical")
        layout.add_widget(self.result)

        buttons = [
            ["7", "8", "9", "/", "sin"],
            ["4", "5", "6", "*", "cos"],
            ["1", "2", "3", "-", "tan"],
            ["C", "0", "=", "+", "√"],
            ["x²", "xʸ", "log", "(", ")"]
        ]

        for row in buttons:
            h_layout = BoxLayout()
            for label in row:
                button = Button(text=label, font_size=24, on_press=self.on_button_press)
                h_layout.add_widget(button)
            layout.add_widget(h_layout)

        return layout

    def on_button_press(self, instance):
        text = instance.text
        if text == "C":
            self.result.text = ""
        elif text == "=":
            try:
                expression = self.result.text.replace("√", "math.sqrt").replace("log", "math.log")
                expression = expression.replace("sin", "math.sin").replace("cos", "math.cos").replace("tan", "math.tan")
                expression = expression.replace("x²", "**2").replace("xʸ", "**")
                self.result.text = str(eval(expression))
            except Exception:
                self.result.text = "Error"
        else:
            if self.result.text == "Error":
                self.result.text = ""

            self.result.text += text

if __name__ == "__main__":
    AdvancedCalculator().run()
