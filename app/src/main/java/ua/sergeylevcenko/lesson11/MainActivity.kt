package ua.sergeylevcenko.lesson11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import ua.sergeylevcenko.lesson11.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater



        inflater.inflate(R.menu.menu_main, menu)

        return super.onCreateOptionsMenu(menu)

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        binding.textView

        when (item.itemId) {

            R.id.action_cat1 -> {
                binding.textView.text = "Вы выбрали кота!"
                return true
            }

            R.id.action_cat2 -> {
                binding.textView.text = "Вы выбрали кошку!"
                return true
            }
            R.id.action_cat3 -> {
                binding.textView.text = "Вы выбрали котёнка!"
                return true
            }
        }

        return super.onOptionsItemSelected(item)

    }
}



















