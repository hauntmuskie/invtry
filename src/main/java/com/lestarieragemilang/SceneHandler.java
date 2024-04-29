package com.lestarieragemilang;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

public class SceneHandler {

    @FXML
    private BorderPane bp;

    @FXML
    private AnchorPane setScene;

    @FXML
    void setSceneKategoriBesi(MouseEvent event) {
        loadPage("kategori");
    }

    @FXML
    void setSceneLaporan(MouseEvent event) {
        loadPage("laporan");
    }

    @FXML
    void setScenePelanggan(MouseEvent event) {
        loadPage("pelanggan");
    }

    @FXML
    void setScenePembelianBesi(MouseEvent event) {
        loadPage("pembelian");
    }

    @FXML
    void setScenePenerimaanBesi(MouseEvent event) {
        loadPage("penerimaan");
    }

    @FXML
    void setScenePenjualanBesi(MouseEvent event) {
        loadPage("penjualan");
    }

    @FXML
    void setSceneStokBesi(MouseEvent event) {
        loadPage("stok-besi");
    }

    @FXML
    void setSceneSupplierBesi(MouseEvent event) {
        loadPage("supplier");
    }

    private void loadPage(String page) {
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource(page + ".fxml"));
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        bp.setCenter(root);
    }

    @FXML
    private void exitApp() {
        System.exit(0);
    }
    
}
