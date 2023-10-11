package br.pucrs.screemmatch.dto;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class SerieDto {
    @JsonAlias("Title")
    private String title;
    @JsonAlias("totalSeasons")
    private Integer totalSeasons;
    @JsonAlias("imdbRating")
    private String imdbRating;
}
