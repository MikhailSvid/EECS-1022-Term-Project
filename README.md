<?xml version="1.0" encoding="utf-8"?><!--makes background a image and keeps the buttons alligned to bottom-->
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignParentStart="true"
        android:layout_alignParentTop="true"
        android:layout_centerHorizontal="true"
        android:layout_marginStart="84dp"
        android:layout_marginTop="82dp"
        android:text="New Password"
        android:textColor="#ADD8E6"
        android:textSize="36dp" />

    <LinearLayout
        android:layout_width="320dp"
        android:layout_height="wrap_content"
        android:layout_alignParentStart="true"
        android:layout_alignParentTop="true"
        android:layout_centerInParent="true"
        android:layout_marginStart="44dp"
        android:layout_marginTop="173dp"
        android:gravity="center_horizontal"
        android:orientation="vertical">


        <TextView
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:text="Enter Username:"
            android:textColor="#ADD8E6"
            android:textSize="18dp" />

        <EditText
            android:layout_width="match_parent"
            android:layout_height="wrap_content" />

        <TextView
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:text="Password:"
            android:textColor="#ADD8E6"
            android:textSize="18dp" />

        <TextView
            android:id="@+id/password"
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:text="_______________________________________"
            android:textColor="#000000"
            android:textSize="18dp" />


    </LinearLayout>

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignParentStart="true"
        android:layout_alignParentEnd="true"
        android:layout_alignParentBottom="true"
        android:layout_centerHorizontal="true"
        android:layout_marginBottom="397dp"
        android:textColor="#000000"
        android:text="Parameters:"
        android:textSize="24dp" />

    <LinearLayout
        android:layout_width="341dp"
        android:layout_height="wrap_content"
        android:layout_alignParentEnd="true"
        android:layout_alignParentBottom="true"
        android:layout_marginEnd="22dp"
        android:layout_marginBottom="206dp"
        android:orientation="vertical">

        <CheckBox
            android:id="@+id/LOWERCASE"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_alignParentStart="true"
            android:layout_alignParentBottom="true"
            android:layout_marginStart="70dp"
            android:text="Lowerase letters" />

        <CheckBox
            android:id="@+id/uppercase"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_alignParentStart="true"
            android:layout_alignParentBottom="true"
            android:layout_marginStart="70dp"
            android:text="Uppercase letters" />

        <CheckBox
            android:id="@+id/numbers"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_alignParentStart="true"
            android:layout_alignParentBottom="true"
            android:layout_marginStart="70dp"
            android:text="Numbers" />

        <CheckBox
            android:id="@+id/special"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_alignParentStart="true"
            android:layout_alignParentBottom="true"
            android:layout_marginStart="70dp"
            android:text="Special Characters" />


    </LinearLayout>

    <Button
        android:id="@+id/gen"
        android:layout_width="394dp"
        android:layout_height="wrap_content"
        android:layout_alignParentStart="true"
        android:layout_alignParentEnd="true"
        android:layout_alignParentBottom="true"
        android:layout_centerHorizontal="true"
        android:layout_marginStart="7dp"
        android:layout_marginEnd="9dp"
        android:layout_marginBottom="108dp"
        android:backgroundTint="#86ceeb"
        android:onClick="generate"
        android:text="Generate"
        android:textColor="@color/white"
        android:textSize="25sp" />

    <Button
        android:id="@+id/save"
        android:layout_width="394dp"
        android:layout_height="wrap_content"
        android:layout_alignParentStart="true"
        android:layout_alignParentEnd="true"
        android:layout_alignParentBottom="true"
        android:layout_centerHorizontal="true"
        android:layout_marginStart="8dp"
        android:layout_marginEnd="8dp"
        android:layout_marginBottom="44dp"
        android:backgroundTint="#86ceeb"
        android:onClick="Save"
        android:text="Save"
        android:textColor="@color/white"
        android:textSize="25sp" />


</RelativeLayout>






**NEW GENERATEDF PASSWORD SCREEN!!**
<?xml version="1.0" encoding="utf-8"?><!--makes background a image and keeps the buttons alligned to bottom-->
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignParentStart="true"
        android:layout_alignParentTop="true"
        android:layout_centerHorizontal="true"
        android:layout_marginStart="84dp"
        android:layout_marginTop="82dp"
        android:text="New Password"
        android:textColor="#ADD8E6"
        android:textSize="36dp" />

    <LinearLayout
        android:layout_width="320dp"
        android:layout_height="wrap_content"
        android:layout_alignParentStart="true"
        android:layout_alignParentTop="true"
        android:layout_centerInParent="true"
        android:layout_marginStart="44dp"
        android:layout_marginTop="173dp"
        android:gravity="center_horizontal"
        android:orientation="vertical">


        <TextView
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:text="Enter Username:"
            android:textColor="#ADD8E6"
            android:textSize="18dp" />

        <EditText
            android:layout_width="match_parent"
            android:layout_height="wrap_content" />

        <TextView
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:text="Password:"
            android:textColor="#ADD8E6"
            android:textSize="18dp" />

        <TextView
            android:id="@+id/password"
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:text="_______________________________________"
            android:textColor="#000000"
            android:textSize="18dp" />


    </LinearLayout>

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignParentStart="true"
        android:layout_alignParentEnd="true"
        android:layout_alignParentBottom="true"
        android:layout_centerHorizontal="true"
        android:layout_marginBottom="397dp"
        android:textColor="#000000"
        android:text="Parameters:"
        android:textSize="24dp" />

    <LinearLayout
        android:layout_width="341dp"
        android:layout_height="wrap_content"
        android:layout_alignParentEnd="true"
        android:layout_alignParentBottom="true"
        android:layout_marginEnd="22dp"
        android:layout_marginBottom="206dp"
        android:orientation="vertical">

        <CheckBox
            android:id="@+id/LOWERCASE"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_alignParentStart="true"
            android:layout_alignParentBottom="true"
            android:layout_marginStart="70dp"
            android:text="Lowerase letters" />

        <CheckBox
            android:id="@+id/uppercase"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_alignParentStart="true"
            android:layout_alignParentBottom="true"
            android:layout_marginStart="70dp"
            android:text="Uppercase letters" />

        <CheckBox
            android:id="@+id/numbers"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_alignParentStart="true"
            android:layout_alignParentBottom="true"
            android:layout_marginStart="70dp"
            android:text="Numbers" />

        <CheckBox
            android:id="@+id/special"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_alignParentStart="true"
            android:layout_alignParentBottom="true"
            android:layout_marginStart="70dp"
            android:text="Special Characters" />


    </LinearLayout>

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignParentStart="true"
        android:layout_alignParentBottom="true"
        android:layout_marginStart="6dp"
        android:layout_marginBottom="158dp"
        android:text="Length of password:"
        android:textColor="@color/black"
        android:textSize="18dp" />

    <EditText
        android:id="@+id/length"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_alignParentStart="true"
        android:layout_alignParentBottom="true"
        android:layout_marginStart="5dp"
        android:layout_marginBottom="124dp" />

    <Button
        android:id="@+id/gen"
        android:layout_width="394dp"
        android:layout_height="wrap_content"
        android:layout_alignParentStart="true"
        android:layout_alignParentEnd="true"
        android:layout_alignParentBottom="true"
        android:layout_centerHorizontal="true"
        android:layout_marginStart="6dp"
        android:layout_marginEnd="10dp"
        android:layout_marginBottom="72dp"
        android:backgroundTint="#86ceeb"
        android:onClick="generate"
        android:text="Generate"
        android:textColor="@color/white"
        android:textSize="25sp" />

    <Button
        android:id="@+id/save"
        android:layout_width="394dp"
        android:layout_height="wrap_content"
        android:layout_alignParentStart="true"
        android:layout_alignParentEnd="true"
        android:layout_alignParentBottom="true"
        android:layout_centerHorizontal="true"
        android:layout_marginStart="6dp"
        android:layout_marginEnd="10dp"
        android:layout_marginBottom="16dp"
        android:backgroundTint="#86ceeb"
        android:onClick="Save"
        android:text="Save"
        android:textColor="@color/white"
        android:textSize="25sp" />


</RelativeLayout>
