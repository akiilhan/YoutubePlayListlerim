/**class FragmentA : Fragment() {

    internal var sayi1: EditText? = null
    internal var sayi2: EditText? = null
    internal var sayilariGOnder: Button? = null

    @Nullable
    fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup,
        savedInstanceState: Bundle
    ): View {


        val v = inflater.inflate(R.layout.fragment_a, container, false)

        sayi1 = v.findViewById(R.id.etSayi1) as EditText
        sayi2 = v.findViewById(R.id.etSayi2) as EditText

        sayilariGOnder = v.findViewById(R.id.btnActivityeSayilariGonder) as Button
        sayilariGOnder!!.setOnClickListener(object : View.OnClickListener() {
            fun onClick(v: View) {
                sendData()
            }
        })

        return v
    }

    fun sendData() {

        val s1 = Integer.parseInt(sayi1!!.getText().toString())
        val s2 = Integer.valueOf(sayi2!!.getText().toString())

        val listener = getActivity() as MyListener
        listener.sayilariTopla(s1, s2)


    }
}*/