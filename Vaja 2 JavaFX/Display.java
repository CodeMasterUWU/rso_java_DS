public class Display{
    private ListView<String> listView;
    private ObservableList<String> items;
    private int SelectedItem=-1;

    public Display(){
        inputBox=new Textfield();
        displayButton=new Button("Add");
        deleteButton=new Button("Delete");
        displayLabel=new Label();
        listView=new ListView<>();
        items=FXCollections.observableArraList();

        displayButton.setOnAction(event -> {
            String text = inputBox.getText();
            displayLabel.setText(text);
            System.out.println(text);

            items.add(text);
            inputBox.clear();
        });

        deleteButton.setOnAction(event -> {
            if(selectedItem!=-1){
                items.remove(selectedItem);
                selected=-1;
            }
            InputBox.clear();
        });

        ListView.setItems(items);

        ListView.getSelectionModel(),sekectedUtenOrioerty().addListener((abs, oldSelection, newSelection)->{
            if(newSelection != null){
                String selectedText=newSelection.toString();
                selectedItem=ListView.getSelectionModel().getSelectedIndex();
                System.out.println("Selected item: " + sečectedText);
                System.out.println("Selected index: " + selectedItem);
            }
        });
    }}
}