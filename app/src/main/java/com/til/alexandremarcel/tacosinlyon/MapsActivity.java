package com.til.alexandremarcel.tacosinlyon;

import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        LatLng misterTacos = new LatLng(45.770159, 4.865939);
        mMap.addMarker(new MarkerOptions().position(misterTacos).title("Mister Tacos"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(misterTacos, 12));

        LatLng hamamet = new LatLng(45.7712109, 4.8669937);
        mMap.addMarker(new MarkerOptions().position(hamamet).title("Hamamet"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(hamamet, 12));

        LatLng planeteSandwich = new LatLng(45.768106, 4.830532);
        mMap.addMarker(new MarkerOptions().position(planeteSandwich).title("Planète Sandwich"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(planeteSandwich, 12));

        LatLng pozePizza = new LatLng(45.738052, 4.864697);
        mMap.addMarker(new MarkerOptions().position(pozePizza).title("Poze Pizza"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(pozePizza, 12));

        LatLng ainElFouara = new LatLng(45.772611, 4.874139);
        mMap.addMarker(new MarkerOptions().position(ainElFouara).title("Ain El Fouara"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(ainElFouara, 12));

        LatLng masterTacos = new LatLng(45.756834, 4.851155);
        mMap.addMarker(new MarkerOptions().position(masterTacos).title("Master Tacos"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(masterTacos, 12));

        LatLng kingTacos = new LatLng(45.768084, 4.883753);
        mMap.addMarker(new MarkerOptions().position(kingTacos).title("King Tacos"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(kingTacos, 12));

        LatLng leTacosLyonnais = new LatLng(45.751283, 4.847956);
        mMap.addMarker(new MarkerOptions().position(leTacosLyonnais).title("Le Tacos Lyonnais"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(leTacosLyonnais, 12));
    }
}