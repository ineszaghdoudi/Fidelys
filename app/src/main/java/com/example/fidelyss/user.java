package com.example.fidelyss;


import java.util.Date;

public class user  {
    private String id;
    private String sexe;
    private String nom;
    private String prenom;
    private Date datenaiss;
    private String email;
    private String nationalite;
    private String adressdomicile;
    private String ville;
    private String codepostal;
    private String pays;
    private String teldomicile;
    private String telmobile;
    private String societe;
    private String fonction;
    private String telprofessionnel;
    private String fax;
    private String langue;

    public user(String id, String sexe, String nom, String prenom, Date datenaiss, String email, String nationalite, String adressdomicile, String ville, String codepostal, String pays, String teldomicile, String telmobile, String societe, String fonction, String telprofessionnel, String fax, String langue) {
        this.id = id;
        this.sexe = sexe;
        this.nom = nom;
        this.prenom = prenom;
        this.datenaiss = datenaiss;
        this.email = email;
        this.nationalite = nationalite;
        this.adressdomicile = adressdomicile;
        this.ville = ville;
        this.codepostal = codepostal;
        this.pays = pays;
        this.teldomicile = teldomicile;
        this.telmobile = telmobile;
        this.societe = societe;
        this.fonction = fonction;
        this.telprofessionnel = telprofessionnel;
        this.fax = fax;
        this.langue = langue;
    }

    public user() {
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDatenaiss() {
        return datenaiss;
    }

    public void setDatenaiss(Date datenaiss) {
        this.datenaiss = datenaiss;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNationalite() {
        return nationalite;
    }

    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }

    public String getAdressdomicile() {
        return adressdomicile;
    }

    public void setAdressdomicile(String adressdomicile) {
        this.adressdomicile = adressdomicile;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getCodepostal() {
        return codepostal;
    }

    public void setCodepostal(String codepostal) {
        this.codepostal = codepostal;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public String getTeldomicile() {
        return teldomicile;
    }

    public void setTeldomicile(String teldomicile) {
        this.teldomicile = teldomicile;
    }

    public String getTelmobile() {
        return telmobile;
    }

    public void setTelmobile(String telmobile) {
        this.telmobile = telmobile;
    }

    public String getSociete() {
        return societe;
    }

    public void setSociete(String societe) {
        this.societe = societe;
    }

    public String getFonction() {
        return fonction;
    }

    public void setFonction(String fonction) {
        this.fonction = fonction;
    }

    public String getTelprofessionnel() {
        return telprofessionnel;
    }

    public void setTelprofessionnel(String telprofessionnel) {
        this.telprofessionnel = telprofessionnel;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getLangue() {
        return langue;
    }

    public void setLangue(String langue) {
        this.langue = langue;
    }
}
