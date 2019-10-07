/**class MainActivity : AppCompatActivity(), MyListener {

    internal var sonuc: TextView? = null

    protected fun onCreate(savedInstanceState: Bundle) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        sonuc = findViewById(R.id.tvSonuc) as TextView

    }

    fun sayilariTopla(sayi1: Int, sayi2: Int) {
        val toplam = sayi1 + sayi2
        sonuc!!.setText("SONUC = $toplam")
    }


}*/