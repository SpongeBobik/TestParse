package java.testparse;

//public class Parser {
//}

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import javax.swing.*;
import javax.swing.text.JTextComponent;
import java.awt.*;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Objects;

public class Weather extends JFrame {
    private JButton button;
    private JTextField textfield;
    private JLabel label;


    public static String GetWeather(String city) throws IOException {
        Document document = Jsoup.connect("https://pogoda.mail.ru/country/russia/").get();
        Elements elements = document.select("li.city-list__item");



        if (Objects.equals(city, "Абакан")){
            return(elements.get(1).text()); //Абакан
        }
        else if (Objects.equals(city, "Адлер")){
            return(elements.get(2).text()); //Адлер
        }
        else if (Objects.equals(city, "Алчевск")){
            return(elements.get(3).text()); //Алчевск
        }
        else if (Objects.equals(city, "Анапа")){
            return(elements.get(4).text()); //Анапа
        }
        else if (Objects.equals(city, "Антрацит")){
            return(elements.get(5).text()); //Антрацит
        }
        else if (Objects.equals(city, "Артемовск")){
            return(elements.get(6).text()); //Артемовск
        }
        else if (Objects.equals(city, "Архангельск")){
            return(elements.get(7).text()); //Архангельск
        }
        else if (Objects.equals(city, "Астрахань")){
            return(elements.get(8).text()); //Астрахань
        }

        //Б
        else if (Objects.equals(city,"Барнаул")){
            return(elements.get(10).text()); // Барнаул
        }
        else if (Objects.equals(city, "Белгород")){
            return(elements.get(11).text()); // Белгород
        }
        else if (Objects.equals(city, "Бердянск")){
            return(elements.get(12).text()); // Бердянск
        }
        else if (Objects.equals(city, "Бийск")){
            return(elements.get(13).text()); // Бийск
        }
        else if (Objects.equals(city, "Благовещенск")){
            return(elements.get(14).text()); // Благовещенск
        }
        else if (Objects.equals(city, "Братск")){
            return(elements.get(15).text()); // Братск
        }
        else if (Objects.equals(city, "Брянск")){
            return(elements.get(16).text()); // Брянск
        }

        //В
        else  if (Objects.equals(city, "Великий Новгород")){
            return(elements.get(18).text()); //Великий Новгород
        }
        else if (Objects.equals(city, "Владивосток")){
            return(elements.get(19).text()); //Владивосток
        }
        else if (Objects.equals(city, "Владикавказ")){
            return(elements.get(20).text()); //Владикавказ
        }
        else if (Objects.equals(city, "Владимир")){
            return(elements.get(21).text()); //Владимир
        }
        else if (Objects.equals(city, "Волгоград")){
            return(elements.get(22).text()); //Волгоград
        }
        else if (Objects.equals(city, "Волгодонск")){
            return(elements.get(23).text()); //Волгодонск
        }
        else if (Objects.equals(city, "Волжский")){
            return(elements.get(24).text()); //Волжский
        }
        else if (Objects.equals(city, "Волноваха")){
            return(elements.get(25).text()); //Волноваха
        }
        else if (Objects.equals(city, "Вологда")){
            return(elements.get(26).text()); //Вологда
        }
        else if (Objects.equals(city, "Воронеж")){
            return(elements.get(27).text()); //Воронеж
        }

        //Г
        else if (Objects.equals(city, "Геленджик")){
            return(elements.get(29).text()); //Геленджик
        }
        else if (Objects.equals(city, "Геническ")){
            return(elements.get(30).text()); //Геническ
        }
        else if (Objects.equals(city, "Горловка")){
            return(elements.get(31).text()); //Горловка
        }

        //Д
        else if (Objects.equals(city, "Димитров")){
            return(elements.get(33).text()); //Димитров
        }
        else if (Objects.equals(city, "Доброполье")){
            return(elements.get(34).text()); //Доброполье
        }
        else if (Objects.equals(city, "Донецк")){
            return(elements.get(35).text()); //Донецк
        }
        else if (Objects.equals(city, "Дружковка")) {
            return(elements.get(36).text()); //Дружковка
        }

        //Е
        else if (Objects.equals(city, "Екатеринбург")){
            return(elements.get(38).text()); //Екатеринбург
        }
        else if (Objects.equals(city, "Енакиево")) {
            return(elements.get(39).text()); //Енакиево
        }

        //Ж
        else if (Objects.equals(city, "Железный Порт")) {
            return(elements.get(41).text()); //Железный Порт
        }

        //З
        else if (Objects.equals(city, "Запорожье")){
            return(elements.get(43).text()); //Запорожье
        }
        else if (Objects.equals(city, "Златоуст")) {
            return(elements.get(44).text()); //Златоуст
        }

        //И
        else if (Objects.equals(city, "Иваново")){
            return(elements.get(46).text()); //Иваново
        }
        else if (Objects.equals(city, "Ижевск")){
            return(elements.get(47).text()); //Ижевск
        }
        else if (Objects.equals(city, "Иркутск")) {
            return(elements.get(48).text()); //Иркутск
        }

        //Й
        else if (Objects.equals(city, "Йошкар-Ола")) {
            return(elements.get(50).text()); //Йошкар-Ола
        }

        //К
        else if (Objects.equals(city, "Казань")) {
            return(elements.get(52).text()); //Казань
        }
        else if (Objects.equals(city, "Калининград")) {
            return(elements.get(53).text()); //Калининград
        }
        else if (Objects.equals(city, "Калуга")) {
            return(elements.get(54).text()); //Калуга
        }
        else if (Objects.equals(city, "Каховка")) {
            return(elements.get(55).text()); // Каховка
        }
        else if (Objects.equals(city, "Кемерово")) {
            return(elements.get(56).text()); // Кемерово
        }
        else if (Objects.equals(city, "Кирилловка")) {
            return(elements.get(57).text()); // Кирилловка
        }
        else if (Objects.equals(city, "Киров")) {
            return(elements.get(58).text()); // Киров
        }
        else if (Objects.equals(city, "Комсомольск-на-Амуре")) {
            return(elements.get(59).text()); // Комсомольск-на-Амуре
        }
        else if (Objects.equals(city, "Константиновка")) {
            return(elements.get(60).text()); // Константиновка
        }
        else if (Objects.equals(city, "Кострома")) {
            return(elements.get(61).text()); // Кострома
        }
        else if (Objects.equals(city, " Краматорск")) {
            return(elements.get(62).text()); // Краматорск
        }
        else if (Objects.equals(city, "Красноармейск")) {
            return(elements.get(63).text()); // Красноармейск
        }
        else if (Objects.equals(city, "Краснодар")) {
            return(elements.get(64).text()); // Краснодар
        }
        else if (Objects.equals(city, "Краснодон")) {
            return(elements.get(65).text()); // Краснодон
        }
        else if (Objects.equals(city, "Красноярск")) {
            return(elements.get(66).text()); // Красноярск
        }
        else if (Objects.equals(city, "Красный Луч")) {
            return(elements.get(67).text()); // Красный Луч
        }
        else if (Objects.equals(city, "Курган")) {
            return(elements.get(68).text()); // Курган
        }
        else if (Objects.equals(city, "Курск")) {
            return(elements.get(69).text()); // Курск
        }

        //Л
        else if (Objects.equals(city, "Липецк")) {
            return(elements.get(71).text()); // Липецк
        }
        else if (Objects.equals(city, "Лисичанск")) {
            return(elements.get(72).text()); // Лисичанск
        }
        else if (Objects.equals(city, "Луганск")) {
            return(elements.get(73).text()); // Луганск
        }

        //М
        else if (Objects.equals(city, "Магнитогорск")) {
            return(elements.get(75).text()); // Магнитогорск
        }
        else if (Objects.equals(city, " Майкоп")) {
            return(elements.get(76).text()); // Майкоп
        }
        else if (Objects.equals(city, "Макеевка")) {
            return(elements.get(77).text()); // Макеевка
        }
        else if (Objects.equals(city, "Мариуполь")) {
            return(elements.get(78).text()); // Мариуполь
        }
        else if (Objects.equals(city, "Махачкала")) {
            return(elements.get(79).text()); // Махачкала
        }
        else if (Objects.equals(city, "Мелитополь")) {
            return(elements.get(80).text()); // Мелитополь
        }
        else if (Objects.equals(city, "Миасс")) {
            return(elements.get(81).text()); // Миасс
        }
        else if (Objects.equals(city, "Москва")) {
            return(elements.get(82).text()); // Москва
        }
        else if (Objects.equals(city, "Мурманск")) {
            return(elements.get(83).text()); // Мурманск
        }

        //Н
        else if (Objects.equals(city, "Набережные Челны")) {
            return(elements.get(85).text()); // Набережные Челны
        }
        else if (Objects.equals(city, "Нальчик")) {
            return(elements.get(86).text()); // Нальчик
        }
        else if (Objects.equals(city, "Находка")) {
            return(elements.get(87).text()); // Находка
        }
        else if (Objects.equals(city, "Нижневартовск")) {
            return(elements.get(88).text()); // Нижневартовск
        }
        else if (Objects.equals(city, "Нижнекамск")) {
            return(elements.get(89).text()); // Нижнекамск
        }
        else if (Objects.equals(city, "Нижний Новгород")) {
            return(elements.get(90).text()); // Нижний Новгород
        }
        else if (Objects.equals(city, "Нижний Тагил")) {
            return(elements.get(91).text()); // Нижний Тагил
        }
        else if (Objects.equals(city, "Новая Каховка")) {
            return(elements.get(92).text()); // Новая Каховка
        }
        else if (Objects.equals(city, "Новокузнецк")) {
            return(elements.get(93).text()); // Новокузнецк
        }
        else if (Objects.equals(city, "Новороссийск")) {
            return(elements.get(94).text()); // Новороссийск
        }
        else if (Objects.equals(city, "Новосибирск")) {
            return(elements.get(95).text()); // Новосибирск
        }

        //О
        else if (Objects.equals(city, "Обнинск")) {
            return(elements.get(97).text()); // Обнинск
        }
        else if (Objects.equals(city, "Омск")) {
            return(elements.get(98).text()); // Омск
        }
        else if (Objects.equals(city, "Орел")) {
            return(elements.get(99).text()); // Орел
        }
        else if (Objects.equals(city, "Оренбург")) {
            return(elements.get(100).text()); // Оренбург
        }

        //П
        else if (Objects.equals(city, "Пенза")) {
            return(elements.get(102).text()); // Пенза
        }
        else if (Objects.equals(city, "Пермь")) {
            return(elements.get(103).text()); // Пермь
        }
        else if (Objects.equals(city, "Петрозаводск")) {
            return(elements.get(104).text()); // Петрозаводск
        }
        else if (Objects.equals(city, "Псков")) {
            return(elements.get(105).text()); // Псков
        }
        else if (Objects.equals(city, "Пятигорск")) {
            return(elements.get(106).text()); // Пятигорск
        }

        //Р
        else if (Objects.equals(city, "Ровеньки")) {
            return(elements.get(108).text()); // Ровеньки
        }
        else if (Objects.equals(city, "Ростов-на-Дону")) {
            return(elements.get(109).text()); // Ростов-на-Дону
        }
        else if (Objects.equals(city, "Рубежное")) {
            return(elements.get(110).text()); // Рубежное
        }
        else if (Objects.equals(city, "Рязань")) {
            return(elements.get(111).text()); // Рязань
        }

        //С
        else if (Objects.equals(city, "Самара")) {
            return(elements.get(113).text()); // Самара
        }
        else if (Objects.equals(city, "Санкт-Петербург")) {
            return(elements.get(114).text()); // Санкт-Петербург
        }
        else if (Objects.equals(city, "Саранск")) {
            return(elements.get(115).text()); // Саранск
        }
        else if (Objects.equals(city, "Саратов")) {
            return(elements.get(116).text()); // Саратов
        }
        else if (Objects.equals(city, "Свердловск")) {
            return(elements.get(117).text()); // Свердловск
        }
        else if (Objects.equals(city, "Севастополь")) {
            return(elements.get(118).text()); // Севастополь
        }
        else if (Objects.equals(city, "Северодонецк")) {
            return(elements.get(119).text()); // Северодонецк
        }
        else if (Objects.equals(city, "Селидово")) {
            return(elements.get(120).text()); // Селидово
        }
        else if (Objects.equals(city, "Симферополь")) {
            return(elements.get(121).text()); // Симферополь
        }
        else if (Objects.equals(city, "Славянск")) {
            return(elements.get(122).text()); // Славянск
        }
        else if (Objects.equals(city, "Смоленск")) {
            return(elements.get(123).text()); // Смоленск
        }
        else if (Objects.equals(city, "Сочи")) {
            return(elements.get(124).text()); // Сочи
        }
        else if (Objects.equals(city, "Ставрополь")) {
            return(elements.get(125).text()); // Ставрополь
        }
        else if (Objects.equals(city, "Старый Оскол")) {
            return(elements.get(126).text()); // Старый Оскол
        }
        else if (Objects.equals(city, "Стаханов")) {
            return(elements.get(127).text()); // Стаханов
        }
        else if (Objects.equals(city, "Стерлитамак")) {
            return(elements.get(128).text()); // Стерлитамак
        }
        else if (Objects.equals(city, "Сургут")) {
            return(elements.get(129).text()); // Сургут
        }
        else if (Objects.equals(city, "Сыктывкар")) {
            return(elements.get(130).text()); // Сыктывкар
        }

        //Т
        else if (Objects.equals(city, "Таганрог")) {
            return(elements.get(132).text()); // Таганрог
        }
        else if (Objects.equals(city, "Тамбов")) {
            return(elements.get(133).text()); // Тамбов
        }
        else if (Objects.equals(city, "Тверь")) {
            return(elements.get(134).text()); // Тверь
        }
        else if (Objects.equals(city, "Токмак")) {
            return(elements.get(135).text()); // Токмак
        }
        else if (Objects.equals(city, "Тольятти")) {
            return(elements.get(136).text()); // Тольятти
        }
        else if (Objects.equals(city, "Томск")) {
            return(elements.get(137).text()); // Томск
        }
        else if (Objects.equals(city, "Торез")) {
            return(elements.get(138).text()); // Торез
        }
        else if (Objects.equals(city, "Тула")) {
            return(elements.get(139).text()); // Тула
        }
        else if (Objects.equals(city, "Тюмень")) {
            return(elements.get(140).text()); // Тюмень
        }

        //У
        else if (Objects.equals(city, "Улан-Удэ")) {
            return(elements.get(142).text()); // Улан-Удэ
        }
        else if (Objects.equals(city, "Ульяновск")) {
            return(elements.get(143).text()); // Ульяновск
        }
        else if (Objects.equals(city, "Уссурийск")) {
            return(elements.get(144).text()); // Уссурийск
        }
        else if (Objects.equals(city, "Уфа")) {
            return(elements.get(145).text()); // Уфа
        }

        //Х
        else if (Objects.equals(city, "Хабаровск")) {
            return(elements.get(147).text()); // Хабаровск
        }
        else if (Objects.equals(city, "Ханты-Мансийск")) {
            return(elements.get(148).text()); // Ханты-Мансийск
        }
        else if (Objects.equals(city, "Харцызск")) {
            return(elements.get(149).text()); // Харцызск
        }
        else if (Objects.equals(city, "Херсон")) {
            return(elements.get(150).text()); // Херсон
        }

        //Ч
        else if (Objects.equals(city, "Чебоксары")) {
            return(elements.get(152).text()); // Чебоксары
        }
        else if (Objects.equals(city, "Челябинск")) {
            return(elements.get(153).text()); // Челябинск
        }
        else if (Objects.equals(city, "Череповец")) {
            return(elements.get(154).text()); // Череповец
        }
        else if (Objects.equals(city, "Черкесск")) {
            return(elements.get(155).text()); // Черкесск
        }
        else if (Objects.equals(city, "Чита")) {
            return(elements.get(156).text()); // Чита
        }

        //Ш
        else if (Objects.equals(city, "Шахтерск")) {
            return(elements.get(158).text()); // Шахтерск
        }

        //Э
        else if (Objects.equals(city, "Энгельс")) {
            return(elements.get(160).text()); // Энгельс
        }
        else if (Objects.equals(city, "Энергодар")) {
            return(elements.get(161).text()); // Энергодар
        }

        //Я
        else if (Objects.equals(city, "Якутск")) {
            return(elements.get(163).text()); // Якутск
        }
        else if (Objects.equals(city, "Ялта")) {
            return(elements.get(164).text()); // Ялта
        }
        else if (Objects.equals(city, "Ярославль")) {
            return(elements.get(165).text()); // Ярославль
        }
        else {
            return("Вы неправильно ввели название города или нет прогноза на этот город.");
        }
    }

    public Weather () throws IOException {
        super("G-gurda");
        setLayout(new FlowLayout());
        button = new JButton("PRESS");
        textfield = new JTextField(10);
        button.addActionListener(button_action(textfield.getText()));

        add(textfield);
        add(button);
        add(label);
    }
    public static ActionListener button_action(String city) throws IOException {
        System.out.println(GetWeather(city));
        return null;
    }

    public static void main(String[] args) throws IOException {
        Weather weather = new Weather();
        weather.setVisible(true);
        weather.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        weather.setSize(300,200);
    }
}

