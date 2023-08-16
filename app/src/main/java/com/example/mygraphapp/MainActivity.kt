package com.example.mygraphapp

import android.content.Intent
import android.graphics.Color
import android.graphics.LinearGradient
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.mikephil.charting.charts.LineChart
import com.github.mikephil.charting.components.Description
import com.github.mikephil.charting.data.BarData
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.data.LineData
import com.github.mikephil.charting.data.LineDataSet
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet
import java.util.Collections
import java.util.PriorityQueue

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val lineChart = findViewById<LineChart>(R.id.line_chart)

        lineChart.data = LineData(LineDataSet(getListOfEntries(), "y point"))
        val description = Description()
        description.text = "Heart Rate"
        lineChart.description = description
        lineChart.xAxis.setDrawAxisLine(true)
        lineChart.xAxis.axisLineColor = Color.BLUE
        lineChart.xAxis.mLabelHeight = 20
        lineChart.invalidate()
    }

    private fun getListOfEntries(): List<Entry>{
        val list = mutableListOf<Entry>()
        list.add(Entry(-1f,0f))
        list.add(Entry(2f,4f))
        list.add(Entry(4f,-1f))
        list.add(Entry(5f,5f))
        return list
    }
}