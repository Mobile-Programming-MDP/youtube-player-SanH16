package com.si51.mashupmusic;

import java.util.ArrayList;

public class Data {

    public static String[][] data = new String[][] {
            {"SING-OFF TIKTOK SONGS Part II (You Broke Me First, De Yang Gatal Gatal Sa) vs Mirriam Eka","Video ini adalah konten ber-copyright. sebagian penghasilan dari youtube akan masuk ke artist original pemilik lagu. Jika kalian mau memberikan support lebih berupa donasi pada kami untuk membantu memajukan channel ini, bisa klik link dibawah ini ya! Terima kasih banyak | https://saweria.co/rezadarmawangsa", "X3wYCb2tACk"},
            {"MASHUP OST Kartun/Anime 90an PART 1 - @EkaGustiwana & @Nadya_Rafika","Subscribe: http://bit.ly/SubscribeEka | Kita nostalgia ke tahun 90an yook! Tulis berapa umur kamu sekarang di kolom comment dan bagikan kenangan masa kecilmu waktu nonton","1Ixg_6Ldyu0"},
            {"Pop Songs World 2020 - Mashup of 50+ Pop Songs","Pop Songs World 2020 - Mashup of 50+ Pop Songs | Video edit by Yabancı Müzikler. | Music Mashed  by DJ Konsky.","2FZYSyvLqnY"},
            {"28 MINUTES OF MASHUPS!","Hope everyone's doing well! We know staying home and social distancing isn't the easiest. So we've compiled some of your (and our) favourite mashups into one massive video to keep you guys entertained during these difficult times. Feel free to listen on repeat Enjoy!","7FzLVQnKx9E"}
    };

    public static ArrayList<DataModel> getData() {
        ArrayList<DataModel> dataModelArrayList = new ArrayList<>();
        for (String[] varData : data) {
            DataModel dataModel = new DataModel();
            dataModel.setJudul(varData[0]);
            dataModel.setKeterangan(varData[1]);
            dataModel.setVideoid(varData[2]);

            dataModelArrayList.add(dataModel);
        }

        return dataModelArrayList;
    }
}
