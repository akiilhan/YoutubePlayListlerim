import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import com.example.fromfragmenttoactivity.MyListener
import com.example.fromfragmenttoactivity.R

class Fragment_A : Fragment() {

    lateinit var sayi1: EditText
    lateinit var sayi2: EditText
    lateinit var sayilariGonder: Button


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var v = inflater.inflate(R.layout.fragment_a, container, false)

        sayi1 = v.findViewById(R.id.etSayi1)
        sayi2 = v.findViewById(R.id.etSayi2)
        sayilariGonder = v.findViewById(R.id.btnActivityeSayilariGonder) as Button
        sayilariGonder.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View) {
                sendData()
            }
        })
        return v


    }

    private fun sendData() {

        var s1 = Integer.parseInt(sayi1.text.toString())
        var s2 = Integer.parseInt(sayi2.text.toString())
        var listener = activity as MyListener
        listener.sayilariTopla(s1, s2)
    }
}