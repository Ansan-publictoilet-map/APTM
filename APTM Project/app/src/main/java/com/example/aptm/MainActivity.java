package com.example.aptm;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.mapbox.mapboxsdk.Mapbox;
import com.mapbox.mapboxsdk.maps.MapView;
import com.mapbox.mapboxsdk.maps.MapboxMap;
import com.mapbox.mapboxsdk.maps.OnMapReadyCallback;
import com.mapbox.mapboxsdk.maps.Style;



public class MainActivity extends AppCompatActivity implements
        OnMapReadyCallback {
        private MapView mapView;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            Mapbox.getInstance(getApplicationContext(), getString(R.string.mapbox_access_token)); //mapbox access token
            setContentView(R.layout.activity_main);
            Mapbox.getInstance(this, "pk.eyJ1IjoiZ2J0d2xkIiwiYSI6ImNrYm9xaWN3bjBzMjcyeXB0dzZtanRnankifQ.Lj4Cm_P80zYLhGJojR1Bbg");
            setContentView(R.layout.activity_main);
            mapView = findViewById(R.id.mapView);
            mapView.onCreate(savedInstanceState);
            mapView.getMapAsync(this);
        }

        @Override
        public void onMapReady(@NonNull final MapboxMap mapboxMap) {
            mapboxMap.setStyle(new Style.Builder().fromUri("mapbox://styles/gbtwld/ckboqvris3m7n1inw41wcglti"));
        }
    @Override
    public void onStart() {
        super.onStart();
        mapView.onStart();
    }

    @Override
    public void onResume() {
        super.onResume();
        mapView.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
        mapView.onPause();
    }

    @Override
    public void onStop() {
        super.onStop();
        mapView.onStop();
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        mapView.onLowMemory();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mapView.onDestroy();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        mapView.onSaveInstanceState(outState);
    }
}