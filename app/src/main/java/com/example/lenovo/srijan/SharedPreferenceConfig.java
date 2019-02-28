package com.example.lenovo.srijan;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPreferenceConfig {
    Context context;
    SharedPreferences sharedPreferences;
    boolean status = false;

    public SharedPreferenceConfig(Context context) {
        this.context = context;
        sharedPreferences = context.getSharedPreferences(context.getResources().getString(R.string.image_preference),Context.MODE_PRIVATE);
    }
    public void writeImagestatus(Boolean status){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(context.getResources().getString(R.string.image_status),status);
        editor.commit();
    }

    public boolean getstatus(){
        status = sharedPreferences.getBoolean(context.getResources().getString(R.string.image_status),true);
        return status;
    }

    public boolean getstatus1(){
        status = sharedPreferences.getBoolean(context.getResources().getString(R.string.image_status1),true);
        return status;
    }
    public void writeImagestatus1(Boolean status){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(context.getResources().getString(R.string.image_status1),status);
        editor.commit();
    }

    public boolean getstatus2(){
        status = sharedPreferences.getBoolean(context.getResources().getString(R.string.image_status2),true);
        return status;
    }
    public void writeImagestatus2(Boolean status){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(context.getResources().getString(R.string.image_status2),status);
        editor.commit();
    }
    public void writeImagestatus3(Boolean status){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(context.getResources().getString(R.string.image_status4),status);
        editor.commit();
    }
    public boolean getstatus3(){
        status = sharedPreferences.getBoolean(context.getResources().getString(R.string.image_status3),true);
        return status;
    }
    public void writeImagestatus4(Boolean status){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(context.getResources().getString(R.string.image_status4),status);
        editor.commit();
    }

    public boolean getstatus4(){
        status = sharedPreferences.getBoolean(context.getResources().getString(R.string.image_status4),true);
        return status;
    }
    public void writeImagestatus5(Boolean status){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(context.getResources().getString(R.string.image_status5),status);
        editor.commit();
    }

    public boolean getstatus5(){
        status = sharedPreferences.getBoolean(context.getResources().getString(R.string.image_status5),true);
        return status;
    }
    public void writeImagestatus6(Boolean status){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(context.getResources().getString(R.string.image_status6),status);
        editor.commit();
    }

    public boolean getstatus6(){
        status = sharedPreferences.getBoolean(context.getResources().getString(R.string.image_status6),true);
        return status;
    }
    public void writeImagestatus7(Boolean status){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(context.getResources().getString(R.string.image_status7),status);
        editor.commit();
    }

    public boolean getstatus7(){
        status = sharedPreferences.getBoolean(context.getResources().getString(R.string.image_status7),true);
        return status;
    }
    public void writeImagestatus8(Boolean status){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(context.getResources().getString(R.string.image_status8),status);
        editor.commit();
    }

    public boolean getstatus8(){
        status = sharedPreferences.getBoolean(context.getResources().getString(R.string.image_status8),true);
        return status;
    }
    public void writeImagestatus9(Boolean status){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(context.getResources().getString(R.string.image_status9),status);
        editor.commit();
    }

    public boolean getstatus9(){
        status = sharedPreferences.getBoolean(context.getResources().getString(R.string.image_status9),true);
        return status;
    }
    public void writeImagestatus10(Boolean status){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(context.getResources().getString(R.string.image_status10),status);
        editor.commit();
    }

    public boolean getstatus10(){
        status = sharedPreferences.getBoolean(context.getResources().getString(R.string.image_status10),true);
        return status;
    }
    public void writeImagestatus11(Boolean status){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(context.getResources().getString(R.string.image_status11),status);
        editor.commit();
    }

    public boolean getstatus11(){
        status = sharedPreferences.getBoolean(context.getResources().getString(R.string.image_status11),true);
        return status;
    }
    public void writeImagestatus12(Boolean status){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(context.getResources().getString(R.string.image_status12),status);
        editor.commit();
    }

    public boolean getstatus12(){
        status = sharedPreferences.getBoolean(context.getResources().getString(R.string.image_status12),true);
        return status;
    }
    public void writeImagestatus13(Boolean status){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(context.getResources().getString(R.string.image_status13),status);
        editor.commit();
    }

    public boolean getstatus13(){
        status = sharedPreferences.getBoolean(context.getResources().getString(R.string.image_status13),true);
        return status;
    }
    public void writeImagestatus14(Boolean status){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(context.getResources().getString(R.string.image_status14),status);
        editor.commit();
    }

    public boolean getstatus14(){
        status = sharedPreferences.getBoolean(context.getResources().getString(R.string.image_status14),true);
        return status;
    }


    public void writeImagestatus15(Boolean status){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(context.getResources().getString(R.string.image_status15),status);
        editor.commit();
    }

    public boolean getstatus15(){
        status = sharedPreferences.getBoolean(context.getResources().getString(R.string.image_status15),true);
        return status;
    }



    public void writeImagestatus16(Boolean status){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(context.getResources().getString(R.string.image_status16),status);
        editor.commit();
    }

    public boolean getstatus16(){
        status = sharedPreferences.getBoolean(context.getResources().getString(R.string.image_status16),true);
        return status;
    }



    public void writeImagestatus17(Boolean status){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(context.getResources().getString(R.string.image_status17),status);
        editor.commit();
    }

    public boolean getstatus17(){
        status = sharedPreferences.getBoolean(context.getResources().getString(R.string.image_status17),true);
        return status;
    }




    public void writeImagestatus18(Boolean status){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(context.getResources().getString(R.string.image_status18),status);
        editor.commit();
    }

    public boolean getstatus18(){
        status = sharedPreferences.getBoolean(context.getResources().getString(R.string.image_status18),true);
        return status;
    }





    public void writeImagestatus19(Boolean status){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(context.getResources().getString(R.string.image_status19),status);
        editor.commit();
    }

    public boolean getstatus19(){
        status = sharedPreferences.getBoolean(context.getResources().getString(R.string.image_status19),true);
        return status;
    }





    public void writeImagestatus20(Boolean status){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(context.getResources().getString(R.string.image_status20),status);
        editor.commit();
    }

    public boolean getstatus20(){
        status = sharedPreferences.getBoolean(context.getResources().getString(R.string.image_status20),true);
        return status;
    }





    public void writeImagestatus21(Boolean status){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(context.getResources().getString(R.string.image_status21),status);
        editor.commit();
    }

    public boolean getstatus21(){
        status = sharedPreferences.getBoolean(context.getResources().getString(R.string.image_status21),true);
        return status;
    }





    public void writeImagestatus22(Boolean status){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(context.getResources().getString(R.string.image_status22),status);
        editor.commit();
    }

    public boolean getstatus22(){
        status = sharedPreferences.getBoolean(context.getResources().getString(R.string.image_status22),true);
        return status;
    }





    public void writeImagestatus23(Boolean status){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(context.getResources().getString(R.string.image_status23),status);
        editor.commit();
    }

    public boolean getstatus23(){
        status = sharedPreferences.getBoolean(context.getResources().getString(R.string.image_status23),true);
        return status;
    }


    public void writeImagestatus24(Boolean status){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(context.getResources().getString(R.string.image_status24),status);
        editor.commit();
    }

    public boolean getstatus24(){
        status = sharedPreferences.getBoolean(context.getResources().getString(R.string.image_status24),true);
        return status;
    }



    public void writeImagestatus25(Boolean status){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(context.getResources().getString(R.string.image_status25),status);
        editor.commit();
    }

    public boolean getstatus25(){
        status = sharedPreferences.getBoolean(context.getResources().getString(R.string.image_status25),true);
        return status;
    }





    public void writeImagestatus26(Boolean status){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(context.getResources().getString(R.string.image_status26),status);
        editor.commit();
    }

    public boolean getstatus26(){
        status = sharedPreferences.getBoolean(context.getResources().getString(R.string.image_status26),true);
        return status;
    }





    public void writeImagestatus27(Boolean status){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(context.getResources().getString(R.string.image_status27),status);
        editor.commit();
    }

    public boolean getstatus27(){
        status = sharedPreferences.getBoolean(context.getResources().getString(R.string.image_status27),true);
        return status;
    }






    public void writeImagestatus28(Boolean status){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(context.getResources().getString(R.string.image_status28),status);
        editor.commit();
    }

    public boolean getstatus28(){
        status = sharedPreferences.getBoolean(context.getResources().getString(R.string.image_status28),true);
        return status;
    }







    public void writeImagestatus29(Boolean status){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(context.getResources().getString(R.string.image_status29),status);
        editor.commit();
    }

    public boolean getstatus29(){
        status = sharedPreferences.getBoolean(context.getResources().getString(R.string.image_status29),true);
        return status;
    }







    public void writeImagestatus30(Boolean status){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(context.getResources().getString(R.string.image_status30),status);
        editor.commit();
    }

    public boolean getstatus30(){
        status = sharedPreferences.getBoolean(context.getResources().getString(R.string.image_status30),true);
        return status;
    }






    public void writeImagestatus31(Boolean status){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(context.getResources().getString(R.string.image_status31),status);
        editor.commit();
    }

    public boolean getstatus31(){
        status = sharedPreferences.getBoolean(context.getResources().getString(R.string.image_status31),true);
        return status;
    }





    public void writeImagestatus32(Boolean status){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(context.getResources().getString(R.string.image_status32),status);
        editor.commit();
    }

    public boolean getstatus32(){
        status = sharedPreferences.getBoolean(context.getResources().getString(R.string.image_status32),true);
        return status;
    }






    public void writeImagestatus33(Boolean status){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(context.getResources().getString(R.string.image_status33),status);
        editor.commit();
    }

    public boolean getstatus33(){
        status = sharedPreferences.getBoolean(context.getResources().getString(R.string.image_status33),true);
        return status;
    }





    public void writeImagestatus34(Boolean status){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(context.getResources().getString(R.string.image_status34),status);
        editor.commit();
    }

    public boolean getstatus34(){
        status = sharedPreferences.getBoolean(context.getResources().getString(R.string.image_status34),true);
        return status;
    }


    public void writeImagestatus35(Boolean status){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(context.getResources().getString(R.string.image_status35),status);
        editor.commit();
    }

    public boolean getstatus35(){
        status = sharedPreferences.getBoolean(context.getResources().getString(R.string.image_status35),true);
        return status;
    }



    public void writeImagestatus36(Boolean status){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(context.getResources().getString(R.string.image_status36),status);
        editor.commit();
    }

    public boolean getstatus36(){
        status = sharedPreferences.getBoolean(context.getResources().getString(R.string.image_status36),true);
        return status;
    }




    public void writeImagestatus37(Boolean status){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(context.getResources().getString(R.string.image_status37),status);
        editor.commit();
    }

    public boolean getstatus37(){
        status = sharedPreferences.getBoolean(context.getResources().getString(R.string.image_status37),true);
        return status;
    }




    public void writeImagestatus38(Boolean status){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(context.getResources().getString(R.string.image_status38),status);
        editor.commit();
    }

    public boolean getstatus38(){
        status = sharedPreferences.getBoolean(context.getResources().getString(R.string.image_status38),true);
        return status;
    }





    public void writeImagestatus39(Boolean status){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(context.getResources().getString(R.string.image_status39),status);
        editor.commit();
    }

    public boolean getstatus39(){
        status = sharedPreferences.getBoolean(context.getResources().getString(R.string.image_status39),true);
        return status;
    }






    public void writeImagestatus40(Boolean status){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(context.getResources().getString(R.string.image_status40),status);
        editor.commit();
    }

    public boolean getstatus40(){
        status = sharedPreferences.getBoolean(context.getResources().getString(R.string.image_status40),true);
        return status;
    }







    public void writeImagestatus41(Boolean status){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(context.getResources().getString(R.string.image_status41),status);
        editor.commit();
    }

    public boolean getstatus41(){
        status = sharedPreferences.getBoolean(context.getResources().getString(R.string.image_status41),true);
        return status;
    }







    public void writeImagestatus42(Boolean status){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(context.getResources().getString(R.string.image_status42),status);
        editor.commit();
    }

    public boolean getstatus42(){
        status = sharedPreferences.getBoolean(context.getResources().getString(R.string.image_status42),true);
        return status;
    }








    public void writeImagestatus43(Boolean status){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(context.getResources().getString(R.string.image_status43),status);
        editor.commit();
    }

    public boolean getstatus43(){
        status = sharedPreferences.getBoolean(context.getResources().getString(R.string.image_status43),true);
        return status;
    }







    public void writeImagestatus44(Boolean status){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(context.getResources().getString(R.string.image_status44),status);
        editor.commit();
    }

    public boolean getstatus44(){
        status = sharedPreferences.getBoolean(context.getResources().getString(R.string.image_status44),true);
        return status;
    }


    public void writeImagestatus45(Boolean status){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(context.getResources().getString(R.string.image_status45),status);
        editor.commit();
    }

    public boolean getstatus45(){
        status = sharedPreferences.getBoolean(context.getResources().getString(R.string.image_status45),true);
        return status;
    }




    public void writeImagestatus46(Boolean status){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(context.getResources().getString(R.string.image_status46),status);
        editor.commit();
    }

    public boolean getstatus46(){
        status = sharedPreferences.getBoolean(context.getResources().getString(R.string.image_status46),true);
        return status;
    }






    public void writeImagestatus47(Boolean status){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(context.getResources().getString(R.string.image_status47),status);
        editor.commit();
    }

    public boolean getstatus47(){
        status = sharedPreferences.getBoolean(context.getResources().getString(R.string.image_status47),true);
        return status;
    }





    public void writeImagestatus48(Boolean status){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(context.getResources().getString(R.string.image_status48),status);
        editor.commit();
    }

    public boolean getstatus48(){
        status = sharedPreferences.getBoolean(context.getResources().getString(R.string.image_status48),true);
        return status;
    }





    public void writeImagestatus49(Boolean status){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(context.getResources().getString(R.string.image_status49),status);
        editor.commit();
    }

    public boolean getstatus49(){
        status = sharedPreferences.getBoolean(context.getResources().getString(R.string.image_status49),true);
        return status;
    }





    public void writeImagestatus50(Boolean status){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(context.getResources().getString(R.string.image_status50),status);
        editor.commit();
    }

    public boolean getstatus50(){
        status = sharedPreferences.getBoolean(context.getResources().getString(R.string.image_status50),true);
        return status;
    }




    public void writeImagestatus51(Boolean status){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(context.getResources().getString(R.string.image_status51),status);
        editor.commit();
    }

    public boolean getstatus51(){
        status = sharedPreferences.getBoolean(context.getResources().getString(R.string.image_status51),true);
        return status;
    }





    public void writeImagestatus52(Boolean status){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(context.getResources().getString(R.string.image_status52),status);
        editor.commit();
    }

    public boolean getstatus52(){
        status = sharedPreferences.getBoolean(context.getResources().getString(R.string.image_status52),true);
        return status;
    }









    public void writeImagestatus53(Boolean status){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(context.getResources().getString(R.string.image_status53),status);
        editor.commit();
    }

    public boolean getstatus53(){
        status = sharedPreferences.getBoolean(context.getResources().getString(R.string.image_status53),true);
        return status;
    }







}