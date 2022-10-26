package youtubeDemo;

public abstract class BaseCreditManager implements ICreditManager {

	@Override
	public abstract void calculate();

	@Override
	public void save() {
		System.out.println("Saved.");
	}
}
// Abstract class'lar ortak operasyonları tutar.
// Diğer sınıflarda bu operasyonu kullanırken override ediyoruz.
// Abstract class'lar sınıf özelliği gösterir.
// Bir sınıf sadece bir abstract sınıfı inherit edebilir.
// Bir sınıf sadece bir abstract class'ı veya başka bir classı inherit edebilir.
// Abstract class'larda interface'ler de new'lenemez.
// İkiside referans tiplerin özelliklerinden yararlanır.
// Yazılımda değişimi komtrol etmek için çok güzel yöntemlerdir.

