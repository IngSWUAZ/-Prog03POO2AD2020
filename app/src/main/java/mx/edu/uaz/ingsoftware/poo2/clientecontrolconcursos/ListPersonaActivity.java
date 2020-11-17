package mx.edu.uaz.ingsoftware.poo2.clientecontrolconcursos;

import android.content.Intent;
import android.view.MenuItem;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import mx.edu.uaz.ingsoftware.poo2.clientecontrolconcursos.clientes.DaoConcursosImpl;

public class ListPersonaActivity extends AppCompatActivity {
    private DaoConcursosImpl mDao;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_persona);
        mDao = new DaoConcursosImpl(getString(R.string.url_base));

        // Cambia el tamano de la letra en el titulo de la Action Bar
        CollapsingToolbarLayout collLayout=findViewById(R.id.toolbar_layout);
        collLayout.setExpandedTitleTextAppearance(R.style.ExpandedAppBar);
        int margen =collLayout.getExpandedTitleMarginStart();
        collLayout.setExpandedTitleMarginStart(margen+getResources().getDimensionPixelSize(R.dimen.text_margin));
        collLayout.setCollapsedTitleTextAppearance(R.style.CollapsedAppBar);

        Toolbar toolbar = findViewById(R.id.detail_toolbar);
        setSupportActionBar(toolbar);

        // Inicializa la accion para el FloatingActionButton
        //TODO

        // Muestra el boton de regreso en la  action bar.
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        // Se obtiene una referencia al RecyclerView
        recyclerView = findViewById(R.id.persona_list);
        // Y se obtiene la informacion a colocar ahi
        llenaRecyclerView(recyclerView);
    }

    /**
     * Metodo que se ejecuta al seleccionar una opcion de la Action Bar
     * @param item  MenuItem seleccionado
     * @return  true si es posible manejar la opcion seleccionada, false de lo contrario
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {

            // Este ID representa el boton de regreso o home. Para esta activity,
            // se muestra el boton de regreso. Para mas detalles, consulte
            // el patron de Navigation en el Android Design:
            // http://developer.android.com/design/patterns/navigation.html#up-vs-back
            //
            navigateUpTo(new Intent(this, MainActivity.class));

            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * Metodo para colocar la informacion en un RecyclerView
     * @param recyclerView Objeto RecyclerView a rellenar
     */
    private void llenaRecyclerView(@NonNull RecyclerView recyclerView) {

    }
}