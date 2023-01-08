/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alif.dao;
import alif.model.Anggota;
import java.util.List;
/**
 *
 * @author ACER
 */
public interface AnggotaDao {
    Anggota save(Anggota anggota);
    Anggota update(int index, Anggota anggota);
    boolean delete(Anggota anggota);
    Anggota getAnggota(int index);
    List<Anggota> getAllAnggota();
}