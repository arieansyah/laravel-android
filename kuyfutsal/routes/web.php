<?php

/*
|--------------------------------------------------------------------------
| Web Routes
|--------------------------------------------------------------------------
|
| Here is where you can register web routes for your application. These
| routes are loaded by the RouteServiceProvider within a group which
| contains the "web" middleware group. Now create something great!
|
*/

Route::get('/', function () {
    return view('index');
});


//tes

Route::get('/home', 'HomeController@index')->name('home');

//Lapangan
Route::get('lapangan/data', 'LapanganController@listData')->name('lapangan.data');
Route::resource('lapangan', 'LapanganController');

//jadwal
Route::get('tes', 'JadwalController@tes');
Route::get('jadwal/mobile', 'JadwalController@listData_Mobile');
Route::get('jadwal/data/', 'JadwalController@listData')->name('jadwal.data');
Route::get('jadwal/{id}/edit', 'JadwalController@edit');
Route::get('jadwal/{id}/editAfter', 'JadwalController@editAfter');
Route::post('jadwal/refresh', 'JadwalController@refresh')->name('jadwal.refresh');
//Route::post('jadwal', 'JadwalController@store')->name('jadwal.store');
Route::delete('jadwal/{id}', 'JadwalController@destroy');
//Route::get('jadwal', 'JadwalController@index');
//Route::patch('jadwal/{id}', 'JadwalController@update');
//Route::controller('/jadwal', 'JadwalController');
Route::resource('jadwal', 'JadwalController');

Auth::routes();

Route::get('/home', 'HomeController@index')->name('home');
