/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.jesus.main;

import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatGitHubIJTheme;
import com.jesus.view.login.LoginForm;
import com.jesus.view.register.RegisterForm;
import java.awt.Color;
import javax.swing.UIManager;

/**
 * 
 * @author Juan `Aether` Martínez <jotamartinezd at gmail.com>
 */
public class Main {
	public static void main(String args[]) {
		try {
			UIManager.put( "Button.arc", 20);
			UIManager.put("TextComponent.arc", 10);
			UIManager.put("Label.arc", 10);
			UIManager.put( "Component.innerFocusWidth", 1 );
			UIManager.put("Component.focusWidth", 1);
			UIManager.put("Component.borderColor", new Color(71, 97, 75));
			UIManager.put("Component.selectionBackground", new Color(71, 97, 75));
			FlatGitHubIJTheme.setup();
		} catch(Exception ex) {
				System.err.println("Failed to initialize LaF");
		}

		run();

	}

	public static void run(){
		RegisterForm registerFrame = new RegisterForm();
		registerFrame.setVisible(true);
	}
}

