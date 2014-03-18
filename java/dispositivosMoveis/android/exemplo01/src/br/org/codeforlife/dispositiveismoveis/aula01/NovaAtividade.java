package br.org.codeforlife.dispositiveismoveis.aula01;

import br.org.codeforlife.aulaestrutura.R;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class NovaAtividade extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_nova_atividade);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.nova_atividade, menu);
		return true;
	}

}
