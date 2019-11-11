package com.example.recyclerPresident;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recyclerPresident.Adapter.PresidentsAdapter;
import com.example.recyclerPresident.model.Presidents;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    //Toolbar mActionBarToolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        List<Presidents> presidentsList = new ArrayList<>();
        presidentsList.add(new Presidents("KP Sharma Oli",R.drawable.kpu,"K.P. Oli was born on 22 February 1952 in a Brahmin family at Terathum. He was the eldest child of Mohan Prasad and Madhumaya Oli. Oli was raised by his grandmother, Rammaya, after his mother died of smallpox when Oli was four.[7] He did his primary school education in Tehrathum and later his family migrated to the south eastern district of Jhapa. He resided mostly in Jhapa during his early political life."));

        presidentsList.add(new Presidents("Barack Obama",R.drawable.barack," Barack H. Obama is the 44th President of the United States. Few presidents have walked a more improbable path to the White House. Born in Hawaii to a mother from Kansas and a father from Kenya, Obama was raised with help from his grandparents, whose generosity of spirit reflected their Midwestern roots. The homespun values they instilled in him, paired with his innate sense of optimism, compelled Obama  "));
        presidentsList.add(new Presidents("Donald Trump",R.drawable.donald,"Donald J. Trump is the very definition of the American success story, setting the standards of excellence in his business endeavors, and now, for the United States of America. reamed big and pushed the boundaries of what is possible his entire career, devoting his life to building business, jobs and the American Dream. This was brought to life by a movement he inspired in the people of America when he"));
        presidentsList.add(new Presidents("George W. Bush",R.drawable.george,"George W. Bush, in full George Walker Bush, (born July 6, 1946, New Haven, Connecticut, U.S.), 43rd activity_presidents of the United States (2001–09), who led his country’s response to the September 11 terrorist attacks in 2001 and initiated the Iraq War in 2003. Narrowly winning the electoral college vote in 2000 over Vice Pres. Al Gore in one of the closest and most-controversial elections in American history."));
        presidentsList.add(new Presidents("Bill Clinton",R.drawable.bill,"William Jefferson Clinton, better known as Bill Clinton (born August 19, 1946) was the 42nd activity_presidents of the United States, serving from 1993 to 2001. In 1978 Clinton became the youngest governor in the country when he was elected governor of Arkansas. Elected U.S. activity_presidents in 1992 and reelected in 1996, Clinton enacted legislation including the Family and Medical Leave Act and oversaw two terms of economic. "));
        presidentsList.add(new Presidents("Ronald Reagan",R.drawable.ronald,"Ronald Reagan initially chose a career in entertainment, appearing in more than 50 films. While in Hollywood, he worked as activity_presidents of the Screen Actor's Guild and met his future wife, Nancy (Davis) Reagan. He later served two terms as governor of California. Originally a liberal Democrat, Reagan ran for the U.S. presidency as a Republican and won two terms, beginning in 1980, ultimately becoming a conservative."));
        presidentsList.add(new Presidents("KP Sharma Oli",R.drawable.kpu,"Barack Hussein Obama II is an American attorney and politician who served as the 44th activity_presidents of the United States from 2009 to 2017."));
        presidentsList.add(new Presidents("Jimmy Carter",R.drawable.jimmy,"Jimmy Carter (James Earl Carter, Jr.), thirty-ninth activity_presidents of the United States, was born Oct. 1, 1924, in the small farming town of Plains, Georgia, and grew up in the nearby community of Archery. His father, James Earl Carter, Sr., was a farmer and businessman; his mother, Lillian Gordy Carter, a registered nurse. He was educated in the public school of Plains, attended Georgia Southwestern College."));
        presidentsList.add(new Presidents("KP Sharma Oli",R.drawable.kpu,"K.P. Oli was born on 22 February 1952 in a Brahmin family at Terathum. He was the eldest child of Mohan Prasad and Madhumaya Oli. Oli was raised by his grandmother, Rammaya, after his mother died of smallpox when Oli was four.[7] He did his primary school education in Tehrathum and later his family migrated to the south eastern district of Jhapa. He resided mostly in Jhapa during his early political life."));

        presidentsList.add(new Presidents("Barack Obama",R.drawable.barack," Barack H. Obama is the 44th President of the United States. Few presidents have walked a more improbable path to the White House. Born in Hawaii to a mother from Kansas and a father from Kenya, Obama was raised with help from his grandparents, whose generosity of spirit reflected their Midwestern roots. The homespun values they instilled in him, paired with his innate sense of optimism, compelled Obama  "));
        presidentsList.add(new Presidents("Donald Trump",R.drawable.donald,"Donald J. Trump is the very definition of the American success story, setting the standards of excellence in his business endeavors, and now, for the United States of America. reamed big and pushed the boundaries of what is possible his entire career, devoting his life to building business, jobs and the American Dream. This was brought to life by a movement he inspired in the people of America when he"));
        presidentsList.add(new Presidents("George W. Bush",R.drawable.george,"George W. Bush, in full George Walker Bush, (born July 6, 1946, New Haven, Connecticut, U.S.), 43rd activity_presidents of the United States (2001–09), who led his country’s response to the September 11 terrorist attacks in 2001 and initiated the Iraq War in 2003. Narrowly winning the electoral college vote in 2000 over Vice Pres. Al Gore in one of the closest and most-controversial elections in American history."));
        presidentsList.add(new Presidents("Bill Clinton",R.drawable.bill,"William Jefferson Clinton, better known as Bill Clinton (born August 19, 1946) was the 42nd activity_presidents of the United States, serving from 1993 to 2001. In 1978 Clinton became the youngest governor in the country when he was elected governor of Arkansas. Elected U.S. activity_presidents in 1992 and reelected in 1996, Clinton enacted legislation including the Family and Medical Leave Act and oversaw two terms of economic. "));
        presidentsList.add(new Presidents("Ronald Reagan",R.drawable.ronald,"Ronald Reagan initially chose a career in entertainment, appearing in more than 50 films. While in Hollywood, he worked as activity_presidents of the Screen Actor's Guild and met his future wife, Nancy (Davis) Reagan. He later served two terms as governor of California. Originally a liberal Democrat, Reagan ran for the U.S. presidency as a Republican and won two terms, beginning in 1980, ultimately becoming a conservative."));
        presidentsList.add(new Presidents("KP Sharma Oli",R.drawable.kpu,"Barack Hussein Obama II is an American attorney and politician who served as the 44th activity_presidents of the United States from 2009 to 2017."));
        presidentsList.add(new Presidents("Jimmy Carter",R.drawable.jimmy,"Jimmy Carter (James Earl Carter, Jr.), 39th activity_presidents of the United States, was born Oct. 1, 1924, in the small farming town of Plains, Georgia, and grew up in the nearby community of Archery. His father, James Earl Carter, Sr., was a farmer and businessman; his mother, Lillian Gordy Carter, a registered nurse. He was educated in the public school of Plains, attended Georgia Southwestern College."));

        PresidentsAdapter presidentsAdapter = new PresidentsAdapter(this,presidentsList);
        recyclerView.setAdapter(presidentsAdapter);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));
    }
}
