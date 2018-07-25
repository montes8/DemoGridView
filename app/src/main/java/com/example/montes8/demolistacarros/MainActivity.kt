package com.example.montes8.demolistacarros

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView
import com.example.listcard.Coche
import com.example.listcard.CocheAdapter
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity (var adapter:CocheAdapter?=null): AppCompatActivity() {

    var listadeCoches = ArrayList<Coche>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        listadeCoches.add(Coche(R.drawable.camaro,"Camaro","coche de camaro ","Precio: $350",false))
        listadeCoches.add(Coche(R.drawable.hw,"shake","coche de shake","Precio: $350",true))
        listadeCoches.add(Coche(R.drawable.hwbudy,"Budy","coche de budy","Precio: $350",false))
        listadeCoches.add(Coche(R.drawable.hwcharnger,"Changer","coche de Changer","Precio: $350",true))
        listadeCoches.add(Coche(R.drawable.hwfunger,"Funger","coche de funger","Precio: $350",false))
        listadeCoches.add(Coche(R.drawable.mario,"Mario","coche de super mario","Precio: $350",false))
        listadeCoches.add(Coche(R.drawable.toad,"Toad","coche de Toad","Precio: $350",true))
        listadeCoches.add(Coche(R.drawable.yoshi,"Yoshi","coche de yoshi","Precio: $350",true))

        adapter= CocheAdapter(this,listadeCoches)
        gridView.adapter=adapter
    }
}
