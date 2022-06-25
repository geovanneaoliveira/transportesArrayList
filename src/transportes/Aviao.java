package transportes;

import transportes.assentos.Assento;
import transportes.assentos.AssentoVoo;

import java.util.ArrayList;
import java.util.SplittableRandom;

public class Aviao implements MeioTransporte {
    private ArrayList<AssentoVoo> assentosAviao = new ArrayList<>();

    public Aviao(int linhasCadeirasLuxo, int linhasCadeirasEconomicas) {
        int linha = 1;
        for (int i = 1; i < linhasCadeirasLuxo * 4; i++) {
            if (i > linha * 4) {
                linha++;
            }
            AssentoVoo assentoVoo = new AssentoVoo();
            assentoVoo.setClasse("LUXO");
            if (i % 4 == 0) {
                assentoVoo.setCodigo("D" + (linha));
            } else if (i % 3 == 0) {
                assentoVoo.setCodigo("C" + (linha));
            } else if (i % 2 == 0) {
                assentoVoo.setCodigo("B" + (linha));
            } else {
                assentoVoo.setCodigo("A" + (linha));
            }
            this.getAssentosAviao().add(assentoVoo);
        }
        for (int i = 1; i < linhasCadeirasEconomicas * 6; i++) {
            if (i > linha * 6) {
                linha++;
            }
            AssentoVoo assentoVoo = new AssentoVoo();
            assentoVoo.setClasse("ECONOMICA");
            if (i % 6 == 0) {
                assentoVoo.setCodigo("F" + (linha));
            } else if (i % 5 == 0) {
                assentoVoo.setCodigo("E" + (linha));
            } else if (i % 4 == 0) {
                assentoVoo.setCodigo("D" + (linha));
            } else if (i % 3 == 0) {
                assentoVoo.setCodigo("C" + (linha));
            } else if (i % 2 == 0) {
                assentoVoo.setCodigo("B" + (linha));
            } else {
                assentoVoo.setCodigo("A" + (linha));
            }
            this.getAssentosAviao().add(assentoVoo);
        }
    }

    //IMPLEMENTS

    @Override
    public boolean verificaOcupacao(String assento) {
        for (AssentoVoo assentoAviao : assentosAviao) {
            if (assentoAviao.getCodigo().equalsIgnoreCase(assento)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int quantidadeLivre() {
        int quantLivre = 0;
        for (AssentoVoo assentoAviao : assentosAviao) {
            if (!assentoAviao.isOcupado()) {
                quantLivre++;
            }
        }
        return quantLivre;
    }

    @Override
    public void mostrarAssentos() {
        System.out.println("DIAGRAMA DE ASSENTOS DO AVIÃO");
        for(int i = 0; i < this.getAssentosAviao().size(); i++){
            if(this.getAssentosAviao().get(i).getClasse().equalsIgnoreCase("LUXO")){
                System.out.print("["+getAssentosAviao().get(i).getCodigo()+"]");
                if((i+1)%4==0){
                    System.out.println();
                }
            }
            if(this.getAssentosAviao().get(i).getClasse().equalsIgnoreCase("ECONOMICA")){
                System.out.print("["+getAssentosAviao().get(i).getCodigo()+"]");
                if((i+1)%6==0){
                    System.out.println();
                }
            }
        }
    }

    @Override
    public Assento getAssento(String codigo) {
        for (AssentoVoo assentoAviao : this.assentosAviao) {
            if (assentoAviao.getCodigo().equalsIgnoreCase(codigo)) {
                return assentoAviao;
            }
        }
        return null;
    }

    public Assento getAssento(String assento, String classe) {
        for (AssentoVoo assentoAviao : this.assentosAviao) {
            if (assentoAviao.getCodigo().equalsIgnoreCase(assento)
                    && assentoAviao.getClasse().equalsIgnoreCase(classe)) {
                return assentoAviao;
            }
        }
        return null;
    }

    //GS

    public ArrayList<AssentoVoo> getAssentosAviao() {
        return assentosAviao;
    }

    public void setAssentosAviao(ArrayList<AssentoVoo> assentosAviao) {
        this.assentosAviao = assentosAviao;
    }
}
