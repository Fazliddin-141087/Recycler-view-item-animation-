package uz.mobiller.animationrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import uz.mobiller.animationrecyclerview.adapters.RvAnimAdapters
import uz.mobiller.animationrecyclerview.models.Anim
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    lateinit var animList:ArrayList<Anim>
    lateinit var rvAnimAdapters: RvAnimAdapters
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loadData()
        rvAnimAdapters= RvAnimAdapters(this,animList)
        rv.adapter=rvAnimAdapters

    }

    private fun loadData() {
        animList= ArrayList()
        for (i in 1..1000){
            animList.add(Anim("https://putidorogi-nn.ru/images/stories/7_chudes_sveta/sovremennie_sem_chudes_sveta_2.jpg","Петра в Иордании"))
            animList.add(Anim("https://putidorogi-nn.ru/images/stories/7_chudes_sveta/sovremennie_sem_chudes_sveta_3.jpg","Чичен-Ица в Мексике"))
            animList.add(Anim("https://putidorogi-nn.ru/images/stories/7_chudes_sveta/sovremennie_sem_chudes_sveta_4.jpg","Статуя Христа-Искупителя в Бразилии"))
            animList.add(Anim("https://putidorogi-nn.ru/images/stories/7_chudes_sveta/sovremennie_sem_chudes_sveta_5.jpg","Римский Колизей в Италии"))
            animList.add(Anim("https://putidorogi-nn.ru/images/stories/7_chudes_sveta/sovremennie_sem_chudes_sveta_6.jpg","Великая китайская стена"))
            animList.add(Anim("https://putidorogi-nn.ru/images/stories/7_chudes_sveta/sovremennie_sem_chudes_sveta_7.jpg","Мачу-Пикчу в Перу"))
            animList.add(Anim("https://putidorogi-nn.ru/images/stories/7_chudes_sveta/sovremennie_sem_chudes_sveta_8.jpg","Тадж-Махал в Индии"))
        }
    }
}