package com.anwesh.uiprojects.linkedttrisqblkstepview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.anwesh.uiprojects.trisqblkstepview.TriSqBlkStepView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        TriSqBlkStepView.create(this)
    }
}
