import { PhotosCategory } from "./PhotosCategory.model";

export interface Portofolio{
    id?: number,
    photo?: string,
    price?: number,
    category?: PhotosCategory
}