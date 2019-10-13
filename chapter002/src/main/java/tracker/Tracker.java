package tracker;

import java.util.Random;
import static java.lang.System.currentTimeMillis;

public class Tracker {

    /**
     * Массив для хранение заявок.
     */
    private final Item[] items = new Item[100];

    /**
     * Указатель ячейки для новой заявки.
     */
    private int position = 0;

    /**
     * Метод реализаущий добавление заявки в хранилище
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        this.items[this.position++] = item;
        return item;
    }

    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     * @return Уникальный ключ.
     */
    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + currentTimeMillis());
    }

    /**
     * Метод редактирует заявку.
     * @param id уникальный идентификатор заявки.
     * @param item отредактированая заявка.
     * @return результат редактирования заявки (удалось отредактировать или не удалось).
     */
    public boolean replace(String id, Item item){
        boolean result = false;
        for (int i = 0; i < items.length; i++){
            if (items[i] != null && items[i].getId().equals(id)){
                items[i] = item;
                result = true;
                break;
            }
        }
        return result;
    }

    /**
     * Метод удаление заявки.
     * @param id уникальный идентификатор заявки.
     * @return результат удаления заявки (удалось удалить или не удалось).
     */
    public boolean delete(String id){
        boolean result = false;
        for (int i = 0; i < items.length; i++){
            if (items[i] != null && items[i].getId().equals(id)){
            System.arraycopy(items, i +1, items, i, items.length -i);
                result = true;
                break;
            }
        }
        return result;
    }

    /**
     * Метод получения списка всех заявок.
     * @return список заявок.
     */
    public Item[] findAll(){
        Item[] result = new Item[position];
        int index = 0;
        for (int i = 0; i < this.items.length; i++){
            if (this.items[i] != null){
                System.arraycopy(this.items, i , result, index, 1);
                index++;
            }
        }
        return result;
    }

    /**
     * Метод поиска заявки по имени.
     * @param key искомое имя.
     * @return если имя заявки существует.
     */
    public Item[] findByName(String key){
        Item[] result = new Item[position];
        int index = 0;
        for (int i = 0; i < this.items.length; i++){
            if (this.items[i].getName().equals(key)){
                System.arraycopy(this.items, i , result, index, 1);
                break;
            }
        }
        return result;
    }

    /**
     * Метод поиска заявки по id.
     * @param id искомое id.
     * @return найденая заявка.
     */
    public Item findById(String id){
        Item result = null;
        for (Item item : this.items) {
            if (item.getId().equals(id)) {
                result = item;
                break;
            }
        }
        return result;
    }
}