/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.jesus.view.components;

// Remember to ask Emmanuel about this imports

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionListener;

/**
 *
 * @author Juan `Aether` Martínez <jotamartinezd at gmail.com>
 */
public class PanelCover extends javax.swing.JPanel {

	private ActionListener event;

	public PanelCover() {
		initComponents();
		setOpaque(false);
	}


	@SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 400, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 300, Short.MAX_VALUE)
    );
  }// </editor-fold>//GEN-END:initComponents

	@Override
	protected void paintComponent(Graphics graphics){
		Graphics2D g2 = (Graphics2D) graphics;
		GradientPaint gradientPaint = new GradientPaint(0,0, new Color(35,116,97), 0, getHeight(), new Color(18,95,54));
		g2.setPaint(gradientPaint);
		g2.fillRect(0,0,getWidth(), getHeight());
			
		super.paintComponent(graphics);
	}

	public void addEvent(ActionListener event){
		this.event = event;	
	}


  // Variables declaration - do not modify//GEN-BEGIN:variables
  // End of variables declaration//GEN-END:variables
}
