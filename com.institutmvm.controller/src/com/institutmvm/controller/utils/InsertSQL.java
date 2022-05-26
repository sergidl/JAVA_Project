package com.institutmvm.controller.utils;

import java.sql.*;

import cat.institutmvm.application.entities.Cartilaginos;
import cat.institutmvm.application.entities.Alga;
import cat.institutmvm.application.entities.Molusc;
import cat.institutmvm.application.entities.Ocell;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class InsertSQL {

	private static String server = "jdbc:mysql://mysql-sdiaz2.alwaysdata.net/";
	private static String bbdd = "sdiaz2_java";
	private static String user = "sdiaz2_java";
	private static String password = "@MVM2022";
	private static Path path = Paths.get(".\\data.txt");
	
	
	/** 
	 * Inserta el Cartilaginos a la BBDD en la taula cartilaginos
	 * 
	 * @param a 
	 * 
	 */
	public static void insertSQL(Cartilaginos a) {
		try {
			Connection con = DriverManager.getConnection(server + bbdd, user, password);
			Statement stmt = con.createStatement();

			String sql = "INSERT INTO cartilaginos (especie, habitat, tempsNavegacio, genere, horaArribada, tamany, vent, nubositat, direccioVent, profunditat, temperaturaSuperficial, embarcacions, tipusEsquer, proshark, parasits, precenciaHams, numHams) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement preparedStmt = con.prepareStatement(sql);
			try {
				preparedStmt.setString(1, a.getEspecie());
				preparedStmt.setString(2, a.getHabitat());
				preparedStmt.setString(3, a.getTempsNavegacio());
				preparedStmt.setString(4, a.getGenere());
				preparedStmt.setString(5, a.getHoraArribada());
				preparedStmt.setFloat(6, a.getTamany());
				preparedStmt.setString(7, a.getVent());
				preparedStmt.setString(8, a.getNubositat());
				preparedStmt.setString(9, a.getDireccioVent());
				preparedStmt.setInt(10, a.getProfunditat());
				preparedStmt.setInt(11, a.getTemperaturaSuperficial());
				preparedStmt.setInt(12, a.getEmbarcacions());
				preparedStmt.setString(13, a.getTipusEsquer());
				preparedStmt.setBoolean(14, a.getProshark());
				preparedStmt.setBoolean(15, a.getParasits());
				preparedStmt.setBoolean(16, a.getPrecenciaHams());
				preparedStmt.setInt(17, a.getNumHams());
				preparedStmt.executeUpdate();
				String question = a.toString() + "\n";
				try {
					Files.write(path, question.getBytes(), StandardOpenOption.APPEND);
				} catch (IOException e) {
					e.printStackTrace();
				}
				System.out.println(SelectSQL.SelectCount(Values.getType(a), stmt));
				System.out.println(SelectSQL.AverageDeepth(Values.getType(a), stmt));
				System.out.println(SelectSQL.SelectMax(Values.getType(a), stmt));
				System.out.println(SelectSQL.SelectMin(Values.getType(a), stmt));
				con.close();
			} catch (Exception e) {
				System.out.println(e);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	/**
	 * Inserta el Molusc en la BBDD a la taula molusc
	 * 
	 * @param a
	 * 
	 */
	public static void insertSQL(Molusc a) {
		try {
			Connection con = DriverManager.getConnection(server + bbdd, user, password);

			Statement stmt = con.createStatement();

			String sql = "INSERT INTO molusc (especie, habitat, tempsNavegacio, genere, horaArribada, tamany, vent, nubositat, direccioVent, profunditat, temperaturaSuperficial, embarcacions, parasits) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement pst = con.prepareStatement(sql);
			try {
				pst.setString(1, a.getEspecie());
				pst.setString(2, a.getHabitat());
				pst.setString(3, a.getTempsNavegacio());
				pst.setString(4, a.getGenere());
				pst.setString(5, a.getHoraArribada());
				pst.setFloat(6, a.getTamany());
				pst.setString(7, a.getVent());
				pst.setString(8, a.getNubositat());
				pst.setString(9, a.getDireccioVent());
				pst.setInt(10, a.getProfunditat());
				pst.setInt(11, a.getTemperaturaSuperficial());
				pst.setInt(12, a.getEmbarcacions());
				pst.setBoolean(13, a.getParasits());
				pst.executeUpdate();
				String question = a.toString() + "\n";
				try {
					Files.write(path, question.getBytes(), StandardOpenOption.APPEND);
				} catch (IOException e) {
					e.printStackTrace();
				}
				System.out.println(SelectSQL.SelectCount(Values.getType(a), stmt));
				System.out.println(SelectSQL.AverageDeepth(Values.getType(a), stmt));
				System.out.println(SelectSQL.SelectMax(Values.getType(a), stmt));
				System.out.println(SelectSQL.SelectMin(Values.getType(a), stmt));
				con.close();
			} catch (Exception e) {
				System.out.println(e);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Inserta l'Ocell en la BBDD a la taula ocell
	 * 
	 * @param a
	 */
	public static void insertSQL(Ocell a) {
		try {
			Connection con = DriverManager.getConnection(server + bbdd, user, password);


			Statement stmt = con.createStatement();
			String sql = "INSERT INTO ocell (especie, habitat, tempsNavegacio, genere, horaArribada, tamany, vent, nubositat, direccioVent, embarcacions, parasits) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
			PreparedStatement pst = con.prepareStatement(sql);
			try {
				pst.setString(1, a.getEspecie());
				pst.setString(2, a.getHabitat());
				pst.setString(3, a.getTempsNavegacio());
				pst.setString(4, a.getGenere());
				pst.setString(5, a.getHoraArribada());
				pst.setFloat(6, a.getTamany());
				pst.setString(7, a.getVent());
				pst.setString(8, a.getNubositat());
				pst.setString(9, a.getDireccioVent());
				pst.setInt(10, a.getEmbarcacions());
				pst.setBoolean(11, a.getParasits());
				pst.executeUpdate();
				String question = a.toString() + "\n";
				try {
					Files.write(path, question.getBytes(), StandardOpenOption.APPEND);
				} catch (IOException e) {
					e.printStackTrace();
				}
				System.out.println(SelectSQL.SelectCount(Values.getType(a), stmt));
				System.out.println(SelectSQL.AverageDeepth(Values.getType(a), stmt));
				System.out.println(SelectSQL.SelectMax(Values.getType(a), stmt));
				System.out.println(SelectSQL.SelectMin(Values.getType(a), stmt));
				con.close();
			} catch (Exception e) {
				System.out.println(e);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Inserta l'Alga en la BBDD a la taula alga
	 * 
	 * @param a
	 */
	public static void insertSQL(Alga a) {
		try {
			Connection con = DriverManager.getConnection(server + bbdd, user, password);

			Statement stmt = con.createStatement();
			String sql = "INSERT INTO alga (especie, habitat, tempsNavegacio, genere, horaArribada, tamany, vent, nubositat, direccioVent, profunditat, temperaturaSuperficial) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
			PreparedStatement pst = con.prepareStatement(sql);
			try {
				pst.setString(1, a.getEspecie());
				pst.setString(2, a.getHabitat());
				pst.setString(3, a.getTempsNavegacio());
				pst.setString(4, a.getGenere());
				pst.setString(5, a.getHoraArribada());
				pst.setFloat(6, a.getTamany());
				pst.setString(7, a.getVent());
				pst.setString(8, a.getNubositat());
				pst.setString(9, a.getDireccioVent());
				pst.setInt(10, a.getProfunditat());
				pst.setInt(11, a.getTemperaturaSuperficial());
				pst.executeUpdate();
				String question = a.toString() + "\n";
				try {
					Files.write(path, question.getBytes(), StandardOpenOption.APPEND);
				} catch (IOException e) {
					e.printStackTrace();
				}
				System.out.println(SelectSQL.SelectCount(Values.getType(a), stmt));
				System.out.println(SelectSQL.AverageDeepth(Values.getType(a), stmt));
				System.out.println(SelectSQL.SelectMax(Values.getType(a), stmt));
				System.out.println(SelectSQL.SelectMin(Values.getType(a), stmt));
				con.close();
			} catch (Exception e) {
				System.out.println(e);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
