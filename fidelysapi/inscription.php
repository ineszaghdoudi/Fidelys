<?php
if ($_SERVER['REQUEST_METHOD']=='POST')
{
	include "bd.php";
    $id=$_POST['id'];
	$nom=$_POST['nom'];
    $prenom=$_POST['prenom'];
    $sexe=$_POST['sexe'];
	$datenaiss=$_POST['datenaiss'];
	$email=$_POST['email'];
	$nationalite=$_POST['nationalite'];
    $adr=$_POST['adressedomicile'];
    $cp=$_POST['codepostal'];
    $pays=$_POST['pays'];
    $ville=$_POST['ville'];
    $teld=$_POST['teldomicile'];
    $telm=$_POST['telmobile'];
    $societe=$_POST['societe'];
    $fonction=$_POST['fonction'];
    $telp=$_POST['telprofessionnel'];
    $fax=$_POST['fax'];
    $langue=$_POST['langue'];
	$sql="insert into  user (id, sexe, nom, prenom, datenaiss, email, nationalite, adressedomicile, ville, codepostal, pays, teldomicile, telmobile, societe, fonction, telprofessionnel, fax, langue) VALUES
      ('$id','$sexe','$nom','$prenom','$datenaiss','$email','$nationalite','$adr','$ville','$cp','$pays','$teld','$telm','$societe','$fonction','$telp','$fax','$langue');";
	$res=$bd->exec($sql);

}

?>