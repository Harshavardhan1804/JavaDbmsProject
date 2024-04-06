package com.example.BLOGPROJECT;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DemoService {

    private static DemoRepository Rp;

    public DemoService ( DemoRepository  Rp){
        this.Rp = Rp;
    }

    public static List<Datas> GetNames(){
        return Rp.GetAllNames();
    }

    public static void addRow(Datas data){
        Rp.addRow(data);
    }

}
