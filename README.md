# SilpCustomButton

Custom button library designed by Abhishek Koirala

Library Property of  © Abhishek Koirala 

To use this in your app, go to project root gradle file and add the following statement

	allprojects

	{
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	
	}

Also open project gradle file and add the following statement in dependencies
  
 
 		dependencies
 		{
		compile 'com.github.developeravsk:SilpCustomButton:1.0'
		}

In xml file define the custom button as
				
	<silptech.developerabhi.silpbutton.SilpCustomButton
	android:id="@+id/clickbtn"
	android:layout_margin="10dp"
	android:layout_width="wrap_content"
	android:layout_height="wrap_content"
	></silptech.developerabhi.silpbutton.SilpCustomButton>
	
In Java, define the custom button as 

	SilpCustomButton button;
	
Setting attributes programatically

	button.setText(".....");
	button.setRadius(int value);
	button.setBackgroundColor(int colorvalue);
        button.setBorderColor(int colorValue);
        buton.setBorderWidth(int value);
