package com.example.eduardo.mimoneda3;

/**
 * Created by eduardo on 02/03/2016.
 */
public class DataBaseManager {

    public static final String TABLE_NAME = "dgastos"; // nombre de la tabla
    public static final String CN_ID="idg"; // nombre de los campos de la tabla
    public static final String CN_MONTO="monto";
    public static final String CN_CONCEPTO="concepto";
    public static final String CN_FECHA="fecha";

    public static final String CREATE_TABLE ="create table " +TABLE_NAME+ " ("
            + CN_ID + " integer primary key autoincrement,"
            + CN_MONTO + " decimal,"
            + CN_CONCEPTO + " text,"
            + CN_FECHA + " date,);";
}
