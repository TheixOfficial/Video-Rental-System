package com.video.rental;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;

public class Main extends JPanel {

	public static int width = 1600;
	public static int height = width / 16 * 9;

	public static void window() {
		JFrame frame = new JFrame();

		JTabbedPane tabs = new JTabbedPane();
		JScrollPane customersTab = new JScrollPane();
		JScrollPane moviesTab = new JScrollPane();

		String[] customersColumns = { "ID", "Name", "Email", "Phone Number", "Customer Number" };

		Object[][] data = { { "1", "2", "3", "4", "5" } };

		JTable customersTable = new JTable(data, customersColumns);
		JTable moviesTable = new JTable(10, 4);

		JButton addMovie, addUser, rentMovie;

		addMovie = new JButton("Add Movie");
		addUser = new JButton("Add User");
		rentMovie = new JButton("Rent Movie");

		customersTab.getViewport().add(customersTable);
		moviesTab.getViewport().add(moviesTable);

		tabs.addTab("Customers", customersTab);
		tabs.addTab("Movies", moviesTab);

		frame.getContentPane().add(addMovie);
		frame.getContentPane().add(addUser);
		frame.getContentPane().add(rentMovie);

		frame.getContentPane().add(tabs);

		frame.pack();

		frame.getContentPane().add(new Main());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setTitle("Movie Rental System");
		frame.setSize(width, height);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);

		addMovie.setBounds(width / 2 - 200, height - 75, 100, 30);
		addUser.setBounds(width / 2 - 50, height - 75, 100, 30);
		rentMovie.setBounds(width / 2 + 100, height - 75, 100, 30);
		tabs.setBounds(0, 0, width, height - 100);

	}

	public static void main(String[] args) {
		window();
	}
}
